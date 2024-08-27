import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double d = Double.parseDouble(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if (d == 0.0 && N == 0)
                break;

            int sour = 0;
            int sweet = 0;

            double[][] xy = new double[N][2];

            for (int i = 0; i < N; i++)
            {
                st = new StringTokenizer(br.readLine());
                xy[i][0] = Double.parseDouble(st.nextToken());
                xy[i][1] = Double.parseDouble(st.nextToken());
            }

            boolean[] isSour = new boolean[N];

            for (int i = 0; i < N; i++)
            {
                for (int j = i + 1; j < N; j++)
                {
                    double distance = Math.sqrt(Math.pow(xy[i][0] - xy[j][0], 2) + Math.pow(xy[i][1] - xy[j][1], 2));
                    if (d > distance)
                    {
                        isSour[i] = true;
                        isSour[j] = true;
                    }
                }
            }

            for (int i = 0; i < N; i++)
            {
                if (isSour[i])
                {
                    sour++;
                }
                else
                {
                    sweet++;
                }
            }

            System.out.printf("%d sour, %d sweet\n", sour, sweet);

        }

    }
}
