import java.io.*;
import java.util.*;

/*
 * BOJ 스타일 입력/출력
 * 상태 정의:
 *  state == 0 : idle
 *  state 1..5 : attack 남은 프레임 k = state (1이면 이번 프레임에 히트)
 *  state 6..20: counter strike 남은 프레임 k = state-5 (1이면 이번 프레임에 히트)
 *
 * 프레임 f(0..300)에서의 처리 순서(프레임 시작 시점에 선택):
 * 1) (idle이면) 시작 선택: 없음/attack 시작/CS 시작  -> 현재 프레임의 상태 s'
 * 2) 같은 프레임 f에서 사건 처리:
 *    - 피오라 히트 합산(fioraHit[f])이 들어오는데, s'가 CS이고 남은>=2면 전부 막힘
 *    - 잭스 히트: s'의 남은==1이면 명중(피오라 riposte 블록이 켜져있으면 0)
 *    - 동시 사망은 무승부 -> 폐기
 *    - 피오라 체력 <= 0 이면 f에서 승리 확정(기록/갱신)
 * 3) 다음 프레임으로 상태 전이(남은 프레임 감소; 히트 프레임(남은==1)이면 다음은 idle)
 */
public class Main {
    static final int MAX_T = 300;
    static final int INF_NEG = -1;

    static boolean isCS(int state) { return state >= 6; }
    static int remaining(int state) { return state == 0 ? 0 : (state <= 5 ? state : state - 5); }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int hp1 = Integer.parseInt(st.nextToken()); // Jax HP
        int hp2 = Integer.parseInt(st.nextToken()); // Fiora HP

        st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken()); // Jax attack dmg
        int d2 = Integer.parseInt(st.nextToken()); // Jax counter strike dmg
        int d3 = Integer.parseInt(st.nextToken()); // Fiora attack dmg
        int d4 = Integer.parseInt(st.nextToken()); // Fiora riposte dmg

        int m = Integer.parseInt(br.readLine().trim());

        // 피오라의 각 프레임 히트 데미지 합, 블록 여부(응수의 9프레임)
        int[] fioraHit = new int[MAX_T + 1];
        boolean[] fioraBlock = new boolean[MAX_T + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if ("attack".equals(name)) {
                int hit = s + 4;
                if (0 <= hit && hit <= MAX_T) fioraHit[hit] += d3;
            } else { // "riposte"
                // 9프레임 동안 블록(시작~시작+8), 10번째 프레임에 타격(= s+9)
                for (int f = s; f <= s + 8 && f <= MAX_T; f++) {
                    if (f >= 0) fioraBlock[f] = true;
                }
                int hit = s + 9;
                if (0 <= hit && hit <= MAX_T) fioraHit[hit] += d4;
            }
        }

        // 상태 수: 0..20 (총 21개)
        final int STATES = 21;

        // DP 배열: bestJHP[t][state][fhp] = 그 시점의 잭스 체력 최댓값 (없으면 -1)
        int T = MAX_T;
        int H = hp2; // Fiora HP 차원 1..hp2 사용
        int[][][] bestJHP = new int[T + 1][STATES][H + 1];
        for (int t = 0; t <= T; t++) {
            for (int s = 0; s < STATES; s++) {
                Arrays.fill(bestJHP[t][s], INF_NEG);
            }
        }

        // 역추적용 이전포인터: (t, state, fhp) <- (t-1, prevState, prevFhp) + prevChoice(0:none,1:A,2:CS)
        int[][][] prevState = new int[T + 1][STATES][H + 1];
        int[][][] prevFhp = new int[T + 1][STATES][H + 1];
        int[][][] prevChoice = new int[T + 1][STATES][H + 1];
        for (int t = 0; t <= T; t++) {
            for (int s = 0; s < STATES; s++) {
                Arrays.fill(prevState[t][s], -1);
                Arrays.fill(prevFhp[t][s], -1);
                Arrays.fill(prevChoice[t][s], 0);
            }
        }

        // 초기 상태: 시간 0, idle, Fiora HP=hp2
        bestJHP[0][0][hp2] = hp1;

        // 승리 기록
        int bestWinTime = Integer.MAX_VALUE;
        int bestWinJHP = -1;
        int winSrcTime = -1, winSrcState = -1, winSrcFhp = -1;
        int winChoiceAtTime = 0; // 이 프레임에 새로 시작한 기술(대개 0)

        for (int t = 0; t <= T; t++) {
            // 다음 레이어( t+1 )는 내부에서 갱신
            for (int s = 0; s < STATES; s++) {
                for (int fhp = 1; fhp <= H; fhp++) {
                    int curJ = bestJHP[t][s][fhp];
                    if (curJ <= 0) continue;

                    // 선택 분기
                    int[][] options; // { newStateAtStartOfThisFrame, choiceCode }
                    if (s == 0) {
                        // idle이면: 유지(0), attack시작(1), CS시작(2)
                        options = new int[][]{
                                {0, 0},
                                {5, 1},   // attack 시작 -> 남은 5
                                {20, 2}   // CS 시작    -> 남은 15 (index 20)
                        };
                    } else {
                        // 스킬 진행 중이면 선택지 없음(유지)
                        options = new int[][]{{s, 0}};
                    }

                    for (int[] opt : options) {
                        int sPrime = opt[0];
                        int choice = opt[1];

                        // 이 프레임 f = t 에서 동시 처리
                        int incoming = fioraHit[t];
                        if (isCS(sPrime) && remaining(sPrime) >= 2) {
                            incoming = 0; // CS 블록
                        }

                        int outgoing = 0;
                        if (remaining(sPrime) == 1) {
                            int dmg = isCS(sPrime) ? d2 : d1;
                            if (fioraBlock[t]) dmg = 0; // 피오라 응수 블록
                            outgoing = dmg;
                        }

                        int newJ = curJ - incoming;
                        int newF = fhp - outgoing;

                        // 판정
                        if (newJ <= 0 && newF <= 0) {
                            // 동시 사망 -> 무승부 -> 불가
                            continue;
                        }
                        if (newJ <= 0) {
                            // 잭스 사망
                            continue;
                        }
                        if (newF <= 0) {
                            // t 프레임에서 승리
                            if (t < bestWinTime || (t == bestWinTime && newJ > bestWinJHP)) {
                                bestWinTime = t;
                                bestWinJHP = newJ;
                                winSrcTime = t;           // 이 프레임 시작 상태의 이전 체인(t까지의 체인)
                                winSrcState = s;          // "선택 전" 상태로 역추적
                                winSrcFhp = fhp;
                                winChoiceAtTime = choice; // 이 프레임에 시작했는지(실제로는 승리 프레임에 새로 시작해서 이길 수는 없음이 자연스럽지만 보존)
                            }
                            continue;
                        }

                        // 다음 프레임 상태로 전이
                        int sNext;
                        int rem = remaining(sPrime);
                        if (sPrime == 0)
                            sNext = 0;
                        else if (rem >= 2)
                        {
                            // 남은 프레임 1 감소
                            int newRem = rem - 1;
                            if (isCS(sPrime))
                                sNext = 5 + newRem; // CS 인덱스 6..20
                            else
                                sNext = newRem;     // A 인덱스 1..5
                        }
                        else
                            // rem == 1 (히트 프레임이었다) -> 다음 프레임은 idle
                            sNext = 0;

                        if (t == T) continue; // 더 이상 다음 프레임 없음

                        int prevVal = bestJHP[t + 1][sNext][newF];
                        if (newJ > prevVal)
                        {
                            bestJHP[t + 1][sNext][newF] = newJ;
                            prevState[t + 1][sNext][newF] = s;
                            prevFhp[t + 1][sNext][newF] = fhp;
                            prevChoice[t + 1][sNext][newF] = choice; // t 프레임의 선택
                        }
                    }
                }
            }
        }

        if (bestWinTime == Integer.MAX_VALUE)
        {
            System.out.println("NO");
            return;
        }

        // 경로 복원: winSrcTime(=bestWinTime), winSrcState, winSrcFhp 에서 0까지 역추적
        List<int[]> actions = new ArrayList<>(); // {time, 1=attack|2=counter}
        // 승리 프레임에서의 선택(대개 0)이 의미 있을 가능성은 거의 없지만, 규칙상 보관
        if (winChoiceAtTime == 1 || winChoiceAtTime == 2)
            actions.add(new int[]{winSrcTime, winChoiceAtTime});

        int t = winSrcTime;
        int s = winSrcState;
        int f = winSrcFhp;
        while (t > 0)
        {
            int ps = prevState[t][s][f];
            int pf = prevFhp[t][s][f];
            int pc = prevChoice[t][s][f]; // t-1 프레임에서의 선택
            if (pc == 1 || pc == 2)
                actions.add(new int[]{t - 1, pc});
            s = ps;
            f = pf;
            t--;
        }

        // 시간 오름차순으로 정렬
        actions.sort(Comparator.comparingInt(a -> a[0]));

        System.out.println("YES");

        for (int[] act : actions)
        {
            if (act[1] == 1)
                System.out.println(act[0] + " attack");
            else
                System.out.println(act[0] + " counter strike");
        }

    }
}
