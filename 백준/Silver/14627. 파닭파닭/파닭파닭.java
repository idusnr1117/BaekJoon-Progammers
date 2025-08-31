import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] pa = new int[S];

        for (int i = 0; i < S; i++)
            pa[i] = Integer.parseInt(br.readLine());

        Arrays.sort(pa);

        long start = 1;
        long end = pa[S - 1];
        long max = 0;

        while (start <= end)
        {
            long mid = (start + end) / 2;
            long padak = 0;

            for (int len : pa)
                padak += len / mid;

            if (padak < C)
                end = mid - 1;
            else
            {
                start = mid + 1;
                max = mid;
            }
        }

        long sum = 0;
        long d = 0;
        for (int len : pa)
        {
            d += len /max;
            if (d > C)
                sum += len - (len / max - (d - C)) * max;
            else
                sum += len - (len / max) * max;
        }

        System.out.println(sum);

    }
}
