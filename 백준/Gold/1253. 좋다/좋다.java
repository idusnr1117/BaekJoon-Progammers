import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] A = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A);

        int result = 0;

        for (int k = 0; k < N; k++)
        {
            long find = A[k];
            int i = 0;
            int j = N - 1;
            while (i < j)
            {
                if (A[i] + A[j] == find)
                {
                    if (i != k && j != k)
                    {
                        result++;
                        break;
                    }
                    else if (i == k)
                        i++;
                    else
                        j--;
                }
                else if (A[i] + A[j] < find)
                    i++;
                else
                    j--;
            }
        }

        System.out.println(result);

    }
}
