import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] S = new long[N];
        long[] C = new long[M];

        st = new StringTokenizer(br.readLine());

        S[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++)
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());

        long answer = 0;

        for (int i = 0; i < N; i++)
        {
            int r = (int) (S[i] % M);
            if (r == 0)
                answer++;
            C[r]++;
        }

        for (int i = 0; i < M; i++)
        {
            if (C[i] > 1)
                answer += (C[i] * (C[i] - 1) / 2);
        }

        System.out.println(answer);

    }
}
