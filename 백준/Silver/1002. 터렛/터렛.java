import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            System.out.println(countIntersections(x1, y1, r1, x2, y2, r2));
        }

    }

    public static int countIntersections(int x1, int y1, int r1, int x2, int y2, int r2)
    {
        if (x1 == x2 && y1 == y2)
        {
            if (r1 == r2)
                return -1;
            return 0;
        }

        int distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        int rDiffSq = (r1 - r2) * (r1 - r2);
        int rSumSq = (r1 + r2) * (r1 + r2);

        if (distSq == rDiffSq || distSq == rSumSq)
            return 1;

        if (rDiffSq < distSq && distSq < rSumSq)
            return 2;

        return 0;
    }

}
