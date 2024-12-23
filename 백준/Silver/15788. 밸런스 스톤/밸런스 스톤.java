import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[][] map = new long[N][N];

        int zeroRow = 0, zeroCol = 0;

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
            {
                map[i][j] = Long.parseLong(st.nextToken());
                if (map[i][j] == 0)
                {
                    zeroRow = i;
                    zeroCol = j;
                }
            }
        }

        long targetSum = 0;
        for (int i = 0; i < N; i++)
        {
            if (i != zeroRow)
            {
                for (int j = 0; j < N; j++)
                    targetSum += map[i][j];
                break;
            }
        }

        long currentRowSum = 0;
        for (int j = 0; j < N; j++)
            currentRowSum += map[zeroRow][j];

        long a = targetSum - currentRowSum;

        map[zeroRow][zeroCol] = a;

        boolean valid = true;

        for (int i = 0; i < N && valid; i++)
        {
            long rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++)
            {
                rowSum += map[i][j];
                colSum += map[j][i];
            }
            if (rowSum != targetSum || colSum != targetSum)
                valid = false;
        }

        if (valid)
        {
            long diagSum1 = 0, diagSum2 = 0;
            for (int i = 0; i < N; i++)
            {
                diagSum1 += map[i][i];
                diagSum2 += map[i][N - 1 - i];
            }
            if (diagSum1 != targetSum || diagSum2 != targetSum)
                valid = false;
        }

        if (valid && a > 0)
            System.out.println(a);
        else
            System.out.println(-1);


    }
}
