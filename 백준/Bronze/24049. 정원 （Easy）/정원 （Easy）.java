import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N + 1][M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++)
        {
            map[i][0] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++)
        {
            map[0][i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 1; i < N + 1; i++)
        {
            for (int j = 1; j < M + 1; j++)
            {
                map[i][j] = map[i][j - 1] ^ map[i - 1][j];
            }
        }

        System.out.println(map[N][M]);

    }
}
