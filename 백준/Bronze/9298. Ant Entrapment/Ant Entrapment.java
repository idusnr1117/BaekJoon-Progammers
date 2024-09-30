import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++)
        {
            int N = Integer.parseInt(br.readLine());
            double[] X = {Double.MAX_VALUE, Double.MIN_VALUE};
            double[] Y = {Double.MAX_VALUE, Double.MIN_VALUE};
            for (int j = 0; j < N; j++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());
                if (j != 0)
                {
                    if (y > Y[1])
                        Y[1] = y;
                    else if (y < Y[0])
                        Y[0] = y;

                    if (x > X[1])
                        X[1] = x;
                    else if (x < X[0])
                        X[0] = x;
                }
                else
                {
                    Arrays.fill(X, x);
                    Arrays.fill(Y, y);
                }
            }

            double sumX = X[0] - X[1];
            double sumY = Y[0] - Y[1];

            System.out.printf("Case %d: Area %f, Perimeter %f\n", i, sumX * sumY, Math.abs(sumX * 2 + sumY * 2));
        }

    }
}