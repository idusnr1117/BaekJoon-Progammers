import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];

        int maxHeight = 0; // 최대 높이 저장

        for (int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
            {
                grid[i][j] = Integer.parseInt(st.nextToken());
                if (grid[i][j] > maxHeight)
                    maxHeight = grid[i][j];
            }
        }

        int maxSafeArea = 1; // 물 높이가 0일 때 최소 안전 영역 1개 이상임

        // 물 높이 0부터 최대 높이까지 하나씩 높여가면서 안전 영역 개수 계산
        for (int water = 0; water <= maxHeight; water++)
        {
            visited = new boolean[n][n];
            int safeAreaCount = 0;

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    // 현재 칸이 잠기지 않았고, 방문하지 않았다면 BFS 탐색
                    if (!visited[i][j] && grid[i][j] > water)
                    {
                        bfs(i, j, water);
                        safeAreaCount++;
                    }
                }
            }

            if (safeAreaCount > maxSafeArea)
                maxSafeArea = safeAreaCount;
        }

        System.out.println(maxSafeArea);
        
    }

    static void bfs(int x, int y, int water)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int cx = curr[0];
            int cy = curr[1];

            for (int dir = 0; dir < 4; dir++)
            {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n)
                {
                    if (!visited[nx][ny] && grid[nx][ny] > water)
                    {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
