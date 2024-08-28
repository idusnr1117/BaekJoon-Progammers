import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] xy = new int[N][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        xy[0][0] = Integer.parseInt(st.nextToken());
        xy[0][1] = Integer.parseInt(st.nextToken());

        double min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 1; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
            double distance = Math.sqrt(Math.pow(xy[0][0] - xy[i][0], 2) + Math.pow(xy[0][1] - xy[i][1], 2));
            if (distance < min)
            {
                min = distance;
                index = i;
            }
        }

        System.out.printf("%d %d\n", xy[0][0], xy[0][1]);
        System.out.printf("%d %d\n", xy[index][0], xy[index][1]);
        System.out.printf("%.2f", Math.sqrt(Math.pow(xy[0][0] - xy[index][0], 2) + Math.pow(xy[0][1] - xy[index][1], 2)));

    }
}
