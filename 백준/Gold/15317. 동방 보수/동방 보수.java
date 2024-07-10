import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동방 수
        int M = Integer.parseInt(st.nextToken()); // 동방 없는 동아리 수
        long X = Long.parseLong(st.nextToken()); // 돈

        long[] repairs = new long[N]; // 고치는데 필요한 돈들
        long[] haves = new long[M]; // 동아리가 가지고 있는 돈들

        // 값 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            repairs[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            haves[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(repairs);
        Arrays.sort(haves);

        int max_len = 0;

        // 가능한 모든 길이를 확인
        for (int len2 = 1; len2 <= Math.min(N, M); len2++) {
            long gap = 0;
            boolean can_repair = true;
            for (int i = 0; i < len2; i++)
            {
                long len = haves[haves.length - len2 + i];
                if (repairs[i] > len)
                {
                    gap += repairs[i] - len;
                }
                if (gap > X)
                {
                    can_repair = false;
                    break;
                }
            }
            if (can_repair)
            {
                max_len = len2;
            }
            else
            {
                break;
            }
        }

        System.out.println(max_len);
    }
}
