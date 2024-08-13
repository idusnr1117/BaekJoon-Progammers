import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = N; i <= K; i++)
        {
            if (i == 1)
            {
                continue;
            }
            if (i == 2)
            {
                System.out.println(i);
                continue;
            }
            boolean sosu = true;
            if (i % 2 == 0)
            {
                continue;
            }
            for (int j = 3; j <= Math.sqrt(i); j += 2)
            {
                if (i % j == 0)
                {
                    sosu = false;
                    break;
                }
            }
            if (sosu)
            {
                System.out.println(i);
            }
        }

    }
}
