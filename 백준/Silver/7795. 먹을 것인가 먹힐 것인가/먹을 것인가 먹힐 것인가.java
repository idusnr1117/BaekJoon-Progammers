import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int n = 0; n < N; n++)
            {
                A[n] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int n = 0; n < M; n++)
            {
                B[n] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);
            Arrays.sort(B);

            int cnt = 0;
            for (int a : A)
            {
                for (int b : B)
                {
                    if (a > b)
                    {
                        cnt++;
                    }
                    else
                    {
                        break;
                    }
                }
            }

            bw.append(String.valueOf(cnt)).append("\n");
        }
        bw.flush();
        bw.close();
    }
}
