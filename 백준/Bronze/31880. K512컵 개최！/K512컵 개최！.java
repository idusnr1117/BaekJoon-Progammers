import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long plus = 0;
        int[] multi = new int[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            plus += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++)
        {
            multi[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(multi);

        for (int i = 0; i < M; i++)
        {
            if (multi[i] != 0)
            {
                plus *= multi[i];
            }
        }

        System.out.println(plus);

    }
}
