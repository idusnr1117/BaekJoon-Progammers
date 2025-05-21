import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] dp = new long[N + 2][N + 2];

        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;

        for (int i = 3; i <= N; i++)
        {
            dp[i][1] = 1;
            for (int j = 2; j < i; j++)
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            dp[i][i] = 1;
        }

        System.out.println(dp[N][K]);

    }
}
