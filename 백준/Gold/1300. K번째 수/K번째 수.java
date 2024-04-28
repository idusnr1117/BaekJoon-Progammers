import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long k = Long.parseLong(br.readLine());

        long low = 1;
        long high = N * N;

        while (low < high)
        {
            long mid = (low + high) / 2;
            long cnt = 0;

            for (int i = 1; i <= N; i++)
            {
                cnt += Math.min(mid / i, N);
            }

            if (cnt < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }

        System.out.println(low);

    }
}
