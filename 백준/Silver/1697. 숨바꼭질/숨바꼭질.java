import java.io.*;
import java.util.*;

public class Main {

    static final int MAX = 100000;
    static boolean[] visited = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수빈 위치
        int K = Integer.parseInt(st.nextToken()); // 동생 위치

        System.out.println(bfs(N, K));

    }

    static int bfs(int start, int target)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0}); // {현재 위치, 시간}
        visited[start] = true;

        while (!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int pos = curr[0];
            int time = curr[1];

            if (pos == target) return time;

            // 가능한 세 가지 이동 방법
            int[] nextPositions = {pos - 1, pos + 1, pos * 2};

            for (int next : nextPositions)
            {
                if (next >= 0 && next <= MAX && !visited[next])
                {
                    visited[next] = true;
                    queue.add(new int[]{next, time + 1});
                }
            }
        }

        return -1; // 도달 불가능한 경우 (문제 조건상 발생하지 않음)
    }
}
