import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        long[] dp = new long[41];

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= N; i++)
        {
            dp[i] = dp[i - 2] + dp[i - 1];
            cnt++;
        }

        System.out.println(dp[N] + " " + --cnt);

    }
}
