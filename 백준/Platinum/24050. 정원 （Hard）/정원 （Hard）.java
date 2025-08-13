import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] left = new int[N + 1];
        int[] top = new int[M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++)
            left[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int j = 1; j <= M; j++)
            top[j] = Integer.parseInt(st.nextToken());

        int ans = 0;

        // 왼쪽 가장자리 기여
        int maskJ = M - 1;
        for (int r = 1; r <= N; r++)
        {
            int u = N - r;
            if ((maskJ & u) == 0)
                ans ^= left[r];
        }

        // 위쪽 가장자리 기여
        int maskI = N - 1;
        for (int c = 1; c <= M; c++)
        {
            int v = M - c;
            if ((maskI & v) == 0)
                ans ^= top[c];
        }

        System.out.println(ans);
    }
}
