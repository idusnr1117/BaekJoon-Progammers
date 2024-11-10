import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            int[][] ab = new int[N][2];
            for (int j = 0; j < N; j++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                ab[j][0] = Integer.parseInt(st.nextToken());
                ab[j][1] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < N - 1; j++)
            {
                for (int k = j + 1; k < N; k++)
                {
                    if ((ab[j][0] > ab[k][0] && ab[j][1] < ab[k][1]) || (ab[j][0] < ab[k][0] && ab[j][1] > ab[k][1]))
                        cnt++;
                }
            }
            System.out.printf("Case #%d: %d\n", i + 1, cnt);
        }

    }
}
