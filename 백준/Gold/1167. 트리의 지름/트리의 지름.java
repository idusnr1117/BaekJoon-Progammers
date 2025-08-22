import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited;
    static int[] distacne;
    static ArrayList<Edge> A[];

    static class Edge
    {
        int e;
        int v;

        public Edge(int e, int v)
        {
            this.e = e;
            this.v = v;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        A = new ArrayList[N + 1];
        distacne = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++)
            A[i] = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            while (st.hasMoreElements())
            {
                int E = Integer.parseInt(st.nextToken());

                if (E == -1)
                    break;
                int V = Integer.parseInt(st.nextToken());
                A[S].add(new Edge(E, V));
            }
        }

        // 절반
        BFS(1);

        int maxIndex = 1;
        for (int i = 2; i <= N; i++)
        {
            if (distacne[maxIndex] < distacne[i])
                maxIndex = i;
        }
        
        // 절반 -> 전체
        distacne = new int[N + 1];
        visited  = new boolean[N + 1];

        BFS(maxIndex);

        Arrays.sort(distacne);

        System.out.println(distacne[N]);

    }

    static void BFS(int index)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        visited[index] = true;
        while (!queue.isEmpty())
        {
            int node = queue.poll();
            for (Edge i : A[node])
            {
                int e = i.e;
                int v = i.v;

                if (!visited[e])
                {
                    visited[e] = true;
                    queue.add(e);
                    distacne[e] = distacne[node] + v;
                }
            }
        }
    }
}
