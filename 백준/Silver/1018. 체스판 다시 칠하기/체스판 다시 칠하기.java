import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min = 64;

        char[][] pattern1 =
        {
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        };

        char[][] pattern2 =
        {
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        };

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++)
        {
            board[i] = br.readLine().toCharArray();
        }

        if (N == 8 && M == 8)
        {
            int patternCnt1 = 0;
            int patternCnt2 = 0;

            for (int x = 0; x < 8; x++)
            {
                for (int y = 0; y < 8; y++)
                {
                    char current = board[x][y];
                    if (current != pattern1[x][y])
                    {
                        patternCnt1++;
                    }
                    if (current != pattern2[x][y])
                    {
                        patternCnt2++;
                    }
                }
            }

            min = Math.min(patternCnt1, patternCnt2);
        }
        else
        {
            for (int i = 0; i <= N - 8; i++)
            {
                for (int j = 0; j <= M - 8; j++)
                {
                    int patternCnt1 = 0;
                    int patternCnt2 = 0;

                    for (int x = 0; x < 8; x++)
                    {
                        for (int y = 0; y < 8; y++)
                        {
                            char current = board[i + x][j + y];
                            if (current != pattern1[x][y])
                            {
                                patternCnt1++;
                            }
                            if (current != pattern2[x][y])
                            {
                                patternCnt2++;
                            }
                        }
                    }

                    min = Math.min(min, Math.min(patternCnt1, patternCnt2));
                }
            }
        }

        System.out.println(min);

    }
}
