import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static boolean arrive;
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arrive = false;
        A = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++)
            A[i] = new ArrayList<>();

        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 0; i < N; i++)
        {
            dfs(i , 1);
            if (arrive)
                break;
        }

        if (arrive)
            System.out.println(1);
        else
            System.out.println(0);

    }

    static void dfs (int now, int depth)
    {
        if (depth == 5)
        {
            arrive = true;
            return;
        }

        visited[now] = true;
        for (int i : A[now])
        {
            if (!visited[i])
                dfs(i , depth + 1);
        }
        visited[now] = false;
    }

}
