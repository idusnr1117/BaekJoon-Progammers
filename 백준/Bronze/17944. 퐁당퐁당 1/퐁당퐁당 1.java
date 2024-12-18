import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()) * 2;
        int T = Integer.parseInt(st.nextToken());

        boolean up = true;

        int cnt = 0;

        for (int i = 1; i <= T; i++)
        {
            if (up)
                cnt++;
            else
                cnt--;
            if (cnt == 1)
                up = true;
            if (cnt == N)
                up = false;
        }

        System.out.println(cnt);

    }
}
