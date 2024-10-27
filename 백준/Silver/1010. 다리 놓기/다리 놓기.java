import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Math.min(N, M - N);

            long result = 1;
            for (int j = 0; j < K; j++)
            {
                result *= (M - j);
                result /= (j + 1);
            }

            System.out.println(result);
        }

    }
}
