import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] on = new boolean[N + 1];

        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("0"))
            {
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken()) + 1;
                for (int j = start; j < end; j++)
                {
                    on[j] = !on[j];
                }
            }
            else
            {
                int cnt = 0;
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken()) + 1;
                for (int j = start; j < end; j++)
                {
                    if (on[j])
                    {
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
        }

    }
}
