import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int[][] num = new int[N][M];

       for (int i = 0; i < N; i++)
       {
           st = new StringTokenizer(br.readLine().replace("", " "));
           for (int j = 0; j < M; j++)
                num[i][j] = Integer.parseInt(st.nextToken());
       }

       int max = 1;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++) {
                for (int k = 1; i + k < N && j + k < M; k++)
                {
                    if (num[i][j] == num[i][j + k] && num[i][j] == num[i + k][j] && num[i][j] == num[i + k][j + k])
                    {
                        int area = (k + 1) * (k + 1);
                        if (area > max)
                            max = area;
                    }
                }
            }
        }

        System.out.println(max);

    }
}
