import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] P = new int[N];

        for (int i = 0; i < N; i++)
        {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);

//       1 + 1 + 2 + 1 + 2 + 3 + 1 + 2 + 3 + 3 + 1 + 2 + 3 + 3 + 4

        int sum = 0;
        for (int i = 1; i < N + 1; i++)
        {
            for (int j = 0; j < i; j++)
            {
                sum += P[j];
            }
        }

        System.out.println(sum);

    }
}
