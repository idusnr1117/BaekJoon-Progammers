import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] information = new int[N][5];
        int[] cnt = new int[N];

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
            {
                information[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    if (information[i][k] == information[j][k])
                    {
                        cnt[i]++;
                        cnt[j]++;
                        break;
                    }
                }
            }
        }

        int max = -1;
        int index = -1;

        for (int i = 0; i < N; i++)
        {
            if (cnt[i] > max)
            {
                max = cnt[i];
                index = i + 1;
            }
        }

        System.out.println(index);

    }
}
