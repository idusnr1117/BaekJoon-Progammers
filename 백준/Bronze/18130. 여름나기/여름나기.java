import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long Q = Long.parseLong(st.nextToken());

        long minCost = Long.MAX_VALUE;
        long index = 0;

        for (long i = 1; i <= N; i++)
        {
            st = new StringTokenizer(br.readLine());
            long P = Long.parseLong(st.nextToken());
            long K = Long.parseLong(st.nextToken());
            long C = Long.parseLong(st.nextToken());
            long num = (Q - 1) / K;
            long total = P + num * (num + 1) / 2 * C;
            if (minCost > total)
            {
                index = i;
                minCost = total;
            }
        }

        System.out.println(index + " " + minCost);

    }
}
