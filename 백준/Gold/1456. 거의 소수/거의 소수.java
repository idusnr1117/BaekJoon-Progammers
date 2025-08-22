import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        long[] A = new long[10000001];

        for (int i = 2; i < A.length; i++)
            A[i] = i;

        for (int i = 2; i <= Math.sqrt(A.length); i++)
        {
            if (A[i] == 0)
                continue;
            for (int j = i + i; j < A.length; j += i)
                A[j] = 0;
        }

        int cnt = 0;
        for (int i = 2; i < 10000001; i++)
        {
            if (A[i] != 0)
            {
                long temp = A[i];
                while ((double)A[i] <= (double) max / (double) temp)
                {
                    if ((double)A[i] >= (double) min / (double) temp)
                        cnt++;
                    temp *= A[i];
                }
            }
        }

        System.out.println(cnt);

    }
}
