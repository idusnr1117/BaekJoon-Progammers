import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[B].add(A);
        }

        int[] count = new int[N + 1];
        int maxCount = 0;

        for (int i = 1; i <= N; i++)
        {
            boolean[] visited = new boolean[N + 1];
            count[i] = bfs(i, graph, visited);
            maxCount = Math.max(maxCount, count[i]);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= N; i++)
            if (count[i] == maxCount)
                result.append(i).append(" ");

        System.out.println(result.toString().trim());

    }

    private static int bfs(int start, List<Integer>[] graph, boolean[] visited)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty())
        {
            int current = queue.poll();
            count++;

            for (int next : graph[current])
            {
                if (!visited[next])
                {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

        return count;

    }
}
