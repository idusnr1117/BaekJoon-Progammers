import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static final int start = 1;
    private static int cnt = 0;
    private static ArrayList<Integer>[] adjList;
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] graph = new int[M][2];

        for (int i = 0; i < M; i++)
        {
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
        }

        solution(graph, N, M);
        System.out.println(cnt);
    }

    public static void solution(int[][] graph, int N, int M) throws IOException
    {
        setting(graph, N);
        dfs(start);

        for (int i = 0; i < visited.length; i++)
        {
            if (!visited[i])
            {
                cnt++;
                dfs(i);
            }
        }
    }

    private static void setting(int[][] graph, int N)
    {
        adjList = new ArrayList[N + 1];
        for (int i = 0; i < adjList.length; i++)
        {
            adjList[i] = new ArrayList<>();
        }

        for (int[] edge : graph)
        {
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

        for (ArrayList<Integer> list : adjList)
        {
            Collections.sort(list);
        }

        visited = new boolean[N + 1];
        answer = new ArrayList<>();
    }

    private static void dfs(int start)
    {
        visited[start] = true;
        answer.add(start);
        for (int next : adjList[start])
        {
            if (!visited[next])
            {
                dfs(next);
            }
        }
    }


}
