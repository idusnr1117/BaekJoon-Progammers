import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long sum = 0;

            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int[] density = new int[m];

            for (int j = 0; j < m; j++)
            {
                density[j] = Integer.parseInt(br.readLine());
            }

            for (int j = 0; j < n; j++)
            {
                st = new StringTokenizer(br.readLine());
                int h = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                int index = Integer.parseInt(st.nextToken());

                sum += h * w * d * density[index - 1];
            }

            System.out.printf("Data Set %d:\n%d\n", i + 1, sum);
        }


    }
}
