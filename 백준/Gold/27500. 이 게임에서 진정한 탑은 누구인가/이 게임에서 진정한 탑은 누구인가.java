import java.io.*;
import java.util.*;

public class Main {

    static final int TMAX = 300;
    static final int INF_NEG = -1_000_000_000;

    static class Parent
    {
        int prevT, prevHp2;
        int action;
        int start;
        Parent() {}
        Parent(int prevT, int prevHp2, int action, int start)
        {
            this.prevT = prevT; this.prevHp2 = prevHp2; this.action = action; this.start = start;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hp1Init = Integer.parseInt(st.nextToken());
        int hp2Init = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int d3 = Integer.parseInt(st.nextToken());
        int d4 = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine().trim());

        int[] fDmg = new int[TMAX + 1];
        boolean[] fBlock = new boolean[TMAX + 1];

        for (int i = 0; i < m; i++)
        {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            if (name.equals("attack"))
            {
                int hit = s + 4;
                if (0 <= hit && hit <= TMAX)
                    fDmg[hit] += d3;
            }
            else
            {
                for (int t = Math.max(0, s);
                     t <= Math.min(TMAX, s + 8); t++) fBlock[t] = true;
                int hit = s + 9;
                if (0 <= hit && hit <= TMAX)
                    fDmg[hit] += d4;
            }
        }

        int[] pref = new int[TMAX + 2];
        for (int t = 0; t <= TMAX; t++)
            pref[t + 1] = pref[t] + fDmg[t];

        int maxHp2 = hp2Init;
        int[][] dp = new int[TMAX + 2][maxHp2 + 1];
        for (int i2 = 0; i2 <= TMAX + 1; i2++)
            Arrays.fill(dp[i2], INF_NEG);
        dp[0][hp2Init] = hp1Init;

        Parent[][] par = new Parent[TMAX + 2][maxHp2 + 1];
        for (int i2 = 0; i2 <= TMAX + 1; i2++)
            for (int j = 0; j <= maxHp2; j++) par[i2][j] = null;

        int bestFinish = Integer.MAX_VALUE;
        int bestRemain = -1;
        int lastPrevT = -1, lastPrevHp2 = -1;
        int lastAction = -1, lastStart = -1;

        for (int t = 0; t <= TMAX; t++)
        {
            for (int hp2 = 1; hp2 <= maxHp2; hp2++)
            {
                int hp1 = dp[t][hp2];
                if (hp1 <= 0)
                    continue;

                if (t < TMAX)
                {
                    int hp1After = hp1 - fDmg[t];
                    if (hp1After > 0)
                    {
                        if (hp1After > dp[t + 1][hp2])
                        {
                            dp[t + 1][hp2] = hp1After;
                            par[t + 1][hp2] = new Parent(t, hp2, 0, t);
                        }
                    }
                }

                if (t + 4 <= TMAX) {
                    int dmgTaken = sum(pref, t, t + 4);
                    int hp1After = hp1 - dmgTaken;
                    if (hp1After > 0) {
                        boolean blocked = fBlock[t + 4];
                        int dealt = blocked ? 0 : d1;
                        int hp2After = Math.max(0, hp2 - dealt);

                        if (hp2After == 0)
                        {
                            if ((t + 4) < bestFinish || ((t + 4) == bestFinish && hp1After > bestRemain)) {
                                bestFinish = t + 4;
                                bestRemain = hp1After;
                                lastPrevT = t; lastPrevHp2 = hp2;
                                lastAction = 1; lastStart = t;
                            }
                        }
                        else
                        {
                            int toT = t + 5;
                            if (hp1After > dp[toT][hp2After])
                            {
                                dp[toT][hp2After] = hp1After;
                                par[toT][hp2After] = new Parent(t, hp2, 1, t);
                            }
                        }
                    }
                }

                if (t + 14 <= TMAX)
                {
                    int dmgTaken = fDmg[t + 14];
                    int hp1After = hp1 - dmgTaken;
                    if (hp1After > 0)
                    {
                        boolean blocked = fBlock[t + 14];
                        int dealt = blocked ? 0 : d2;
                        int hp2After = Math.max(0, hp2 - dealt);

                        if (hp2After == 0)
                        {
                            if ((t + 14) < bestFinish || ((t + 14) == bestFinish && hp1After > bestRemain))
                            {
                                bestFinish = t + 14;
                                bestRemain = hp1After;
                                lastPrevT = t; lastPrevHp2 = hp2;
                                lastAction = 2; lastStart = t;
                            }
                        }
                        else
                        {
                            int toT = t + 15;
                            if (hp1After > dp[toT][hp2After])
                            {
                                dp[toT][hp2After] = hp1After;
                                par[toT][hp2After] = new Parent(t, hp2, 2, t);
                            }
                        }
                    }
                }
            }
        }

        if (bestFinish == Integer.MAX_VALUE)
        {
            System.out.println("NO");
            return;
        }

        List<int[]> actions = new ArrayList<>();
        int curT = lastPrevT, curHp2 = lastPrevHp2;
        while (!(curT == 0 && curHp2 == hp2Init))
        {
            Parent p = par[curT][curHp2];
            if (p == null)
                break;
            if (p.action == 1 || p.action == 2)
                actions.add(new int[]{p.start, p.action});
            curT = p.prevT;
            curHp2 = p.prevHp2;
        }

        Collections.sort(actions, Comparator.comparingInt(a -> a[0]));

        actions.add(new int[]{lastStart, lastAction});

        System.out.println("YES");
        for (int[] act : actions)
        {
            int s = act[0];
            if (act[1] == 1)
                System.out.println(s + " attack");
            else
                System.out.println(s + " counter strike");
        }
    }

    static int sum(int[] pref, int a, int b)
    {
        if (a > b) return 0;
        a = Math.max(0, a);
        b = Math.min(TMAX, b);
        return pref[b + 1] - pref[a];
    }

}
