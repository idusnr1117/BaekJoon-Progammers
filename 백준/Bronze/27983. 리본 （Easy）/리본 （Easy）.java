import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        int[] L = new int[N];
        String[] C = new String[N];

        int[][] nums = {X, L};

        for (int i = 0; i < 2; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                nums[i][j] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int j = 0; j < N; j++)
            C[j] = st.nextToken();

        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (Math.abs(X[i] - X[j]) <= L[i] + L[j] && !C[i].equals(C[j]))
                {
                    System.out.println("YES");
                    System.out.printf("%d %d\n", i + 1, j + 1);
                    System.exit(0);
                }
            }
        }

        System.out.println("NO");

    }
}