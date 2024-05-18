import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long cnt = 0;
        long[] nums = new long[M];

        int sum = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            nums[sum]++;
        }

        for (int i = 0; i < M; i++)
        {
            if (nums[i] > 1)
            {
                cnt += nums[i] * (nums[i] - 1) / 2;
            }
        }

        cnt += nums[0];
        System.out.println(cnt);
    }
}
