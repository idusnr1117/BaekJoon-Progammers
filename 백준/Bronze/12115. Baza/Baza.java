import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] database = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
            {
                database[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int Q = Integer.parseInt(br.readLine());

        int[][] queries = new int[Q][M];

        for (int i = 0; i < Q; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
            {
                queries[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < Q; i++)
        {
            int count = 0;
            for (int j = 0; j < N; j++)
            {
                boolean match = true;
                for (int k = 0; k < M; k++)
                {
                    if (queries[i][k] != -1 && queries[i][k] != database[j][k])
                    {
                        match = false;
                        break;
                    }
                }
                if (match)
                {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
