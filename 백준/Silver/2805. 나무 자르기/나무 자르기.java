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
        Long M = Long.parseLong(st.nextToken());

        int[] woods = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) woods[i] = Integer.parseInt(st2.nextToken());

        Arrays.sort(woods);

        int left = 0;
        int right = woods[N - 1];

        while (left <= right) {
            int mid = (left + right) / 2;
            Long sum = 0L;

            for (int wood : woods) {
                if (wood > mid) {
                    sum += wood - mid;
                }
            }

            if (sum >= M)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }
}
