import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        grid = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++)
                grid[i][j] = Integer.parseInt(st.nextToken());
        }

        int pictureCount = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (grid[i][j] == 1 && !visited[i][j])
                {
                    pictureCount++;
                    int area = bfs(i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(pictureCount);
        System.out.println(maxArea);
        
    }

    static int bfs(int x, int y)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        int area = 1;

        while (!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int cx = curr[0];
            int cy = curr[1];

            for (int dir = 0; dir < 4; dir++)
            {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m)
                {
                    if (grid[nx][ny] == 1 && !visited[nx][ny])
                    {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                        area++;
                    }
                }
            }
        }

        return area;
    }
    
}
