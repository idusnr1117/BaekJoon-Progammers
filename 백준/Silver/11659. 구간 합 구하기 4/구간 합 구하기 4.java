import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] dp = new int[N + 1];

        dp[1] = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= N; i++)
        {
            dp[i] = dp[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < M; k++)
        {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(dp[j] - dp[i - 1]);
        }


    }
}
