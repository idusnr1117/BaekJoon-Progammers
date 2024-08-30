import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int cnt = 0;

        int[] coins = new int[N];

        for (int i = 0; i < N; i++)
        {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; 0 <= i; i--)
        {
            cnt += money / coins[i];
            money %= coins[i];
        }

        System.out.println(cnt);

    }
}
