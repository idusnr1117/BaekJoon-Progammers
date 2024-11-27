import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] map = new int[N];
        int[] dice = new int[M];

        for (int i = 0; i < N; i++)
            map[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++)
            dice[i] = Integer.parseInt(br.readLine());

        int index = 0;
        int cnt = 0;

        for (int i = 0; i < M; i++)
        {
            cnt++;
            index += dice[i];

            if (index >= N - 1)
            {
                System.out.println(cnt);
                break;
            }
            if (dice[i] > 0)
                index += map[index];
            else if (dice[i] < 0)
                index += Math.abs(map[index]);
            if (index >= N - 1)
            {
                System.out.println(cnt);
                break;
            }
        }

    }
}
