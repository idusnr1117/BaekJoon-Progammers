import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] parents = new int[N][2];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());

            parents[i][0] = Integer.parseInt(st.nextToken());
            parents[i][1] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++)
        {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;

        for (int i = 0; i < N; i++)
        {
            int mom = parents[i][0];
            int dad = parents[i][1];
            if (mom != 0 && dad != 0)
            {
                if (!set.contains(mom) && !set.contains(dad) && !set.contains(i + 1))
                {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
