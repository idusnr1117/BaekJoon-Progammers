import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long solutions[] = new long[(int) N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            solutions[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(solutions);

        long min = Long.MAX_VALUE;
        long result[] = new long[3];
        for (int i = 0; i < solutions.length - 2; i++)
        {
            int j = i + 1;
            int k = solutions.length - 1;

            while (j < k)
            {
                long sum = solutions[i] + solutions[j] + solutions[k];

                if (Math.abs(sum) < Math.abs(min))
                {
                    min = sum;
                    result[0] = solutions[i];
                    result[1] = solutions[j];
                    result[2] = solutions[k];
                }

                if (sum < 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }

        System.out.println(result[0] + " " + result[1] + " " + result[2]);

    }
}

