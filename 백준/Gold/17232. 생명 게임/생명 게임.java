import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        char place[][] = new char[N + 1][M + 1];

        for (int i = 1; i < N + 1; i++) {
            String str = br.readLine();
            for (int j = 1; j < M + 1; j++) {
                place[i][j] = str.charAt(j - 1);
            }
        }

        int sums[][] = new int[N + 1][M + 1];

        for (int time = 0; time < T; time++)
        {
            for (int i = 1; i < N + 1; i++)
            {
                for (int j = 1; j < M + 1; j++)
                {
                    sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1];
                    if (place[i][j] == '*')
                    {
                        sums[i][j]++;
                    }
                }
            }

            for (int i = 1; i < N + 1; i++)
            {
                for (int j = 1; j < M + 1; j++)
                {
                    int row1 = Math.max(i - K, 1);
                    int column1 = Math.max(j - K, 1);
                    int row2 = Math.min(i + K, N);
                    int column2 = Math.min(j + K, M);

                    int around = sums[row2][column2] - sums[row2][column1 - 1] - sums[row1 - 1][column2] + sums[row1 - 1][column1 - 1];
                    if (place[i][j] == '*') {
                        around--;
                        if (around < a || around > b)
                        {
                            place[i][j] = '.';
                        }
                    }
                    else
                    {
                        if (around > a && around <= b)
                        {
                            place[i][j] = '*';
                        }
                    }
                }
            }
        }

        for (int i = 1; i < N + 1; i++)
        {
            for (int j = 1; j < M + 1; j++)
            {
                System.out.print(place[i][j]);
            }
            System.out.println();
        }

    }
}
