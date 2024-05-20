import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long times[] = new long[N];

        for (int i = 0; i < N; i++)
        {
            times[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(times);
        long left = times[0];
        long right = times[times.length - 1] * M;

        while (left <= right)
        {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++)
            {
                sum += mid / times[i];
                if (sum >= M)
                {
                    break;
                }
            }
            if (sum < M)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        System.out.println(left);

    }
}
