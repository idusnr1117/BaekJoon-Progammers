import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        map = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1)
                {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        int day = bfs(queue);

        // 모두 익었는지 확인
        if (hasUnripeTomato())
            System.out.println(-1);
        else
            System.out.println(day);

    }

    static int bfs(Queue<int[]> queue)
    {
        int day = -1;

        while (!queue.isEmpty())
        {
            int size = queue.size();
            day++;

            for (int i = 0; i < size; i++)
            {
                int[] curr = queue.poll();
                int x = curr[0];
                int y = curr[1];

                for (int dir = 0; dir < 4; dir++)
                {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= M)
                        continue;

                    if (!visited[nx][ny] && map[nx][ny] == 0)
                    {
                        visited[nx][ny] = true;
                        map[nx][ny] = 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        return day;
    }

    static boolean hasUnripeTomato()
    {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (map[i][j] == 0)
                    return true;
        return false;
    }

}
