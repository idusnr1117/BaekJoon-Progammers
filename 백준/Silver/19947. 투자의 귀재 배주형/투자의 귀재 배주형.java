import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[] dp = new int[Y + 1];
        dp[0] = H;

        for (int i = 1; i <= Y; i++)
        {
            // 1년 투자 (5%) -1 탐색
            dp[i] = (int)(dp[i - 1] * 1.05);

            // 3년 투자 (20%) i가 3보다 커졌을 경우부터 -3에서 1.2를 곱했을 때 비교
            if (i >= 3)
                dp[i] = Math.max(dp[i], (int)(dp[i - 3] * 1.2));

            // 5년 투자 (35%) i가 5보다 커졌을 경우부터 -5에서 1.35를 곱했을 때 비교
            if (i >= 5)
                dp[i] = Math.max(dp[i], (int)(dp[i - 5] * 1.35));
        }

        System.out.println(dp[Y]);

    }
}
