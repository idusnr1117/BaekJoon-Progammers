import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] course = new int[N];

        long sum = 0;

        for (int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            course[i] = num;
            sum += num;
        }

        if (K > sum)
        {
            K %= sum;
            for (int i = N - 1; -1 < i; i--)
            {
                if (course[i] - 1 < K)
                {
                    K -= course[i];
                }
                else
                {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < N - 1; i++)
            {
                if (course[i] - 1 < K)
                {
                    K -= course[i];
                }
                else
                {
                    System.out.println(i + 1);
                    break;
                }
            }
        }

    }
}
