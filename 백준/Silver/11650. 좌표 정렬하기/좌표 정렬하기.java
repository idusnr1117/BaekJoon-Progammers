import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] p1, int[] p2)
            {
                if (p1[0] != p2[0])
                {
                    return Integer.compare(p1[0], p2[0]); // x가 다르면 x끼리 비교
                }
                else
                {
                    return Integer.compare(p1[1], p2[1]); // x가 같으면 y끼리 비교
                }
            }
        });

        for (int[] point : points)
        {
            System.out.println(point[0] + " " + point[1]);
        }



    }
}
