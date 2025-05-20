import java.io.*;
import java.util.*;

public class Main {
    static int w, h;
    static char[][] map;
    static int[][] fireTime, dist;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            map = new char[h][w];
            fireTime = new int[h][w];
            dist = new int[h][w];

            Queue<Point> fireQueue = new LinkedList<>();
            Point start = null;

            for (int i = 0; i < h; i++)
            {
                String line = br.readLine();
                for (int j = 0; j < w; j++)
                {
                    map[i][j] = line.charAt(j);
                    fireTime[i][j] = 0;
                    dist[i][j] = 0;

                    if (map[i][j] == '*')
                    {
                        fireQueue.add(new Point(i, j));
                        fireTime[i][j] = 1;
                    }
                    else if (map[i][j] == '@')
                    {
                        start = new Point(i, j);
                        dist[i][j] = 1;
                    }
                }
            }

            spreadFire(fireQueue);
            int result = escape(start);
            System.out.println(result == -1 ? "IMPOSSIBLE" : result);

        }
    }

    // 불 확산 BFS
    static void spreadFire(Queue<Point> fireQueue)
    {
        while (!fireQueue.isEmpty())
        {
            Point p = fireQueue.poll();

            for (int dir = 0; dir < 4; dir++)
            {
                int nx = p.x + dx[dir];
                int ny = p.y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                if (map[nx][ny] == '#' || fireTime[nx][ny] > 0) continue;

                fireTime[nx][ny] = fireTime[p.x][p.y] + 1;
                fireQueue.add(new Point(nx, ny));
            }
        }
    }

    // 상근이 탈출 BFS
    static int escape(Point start)
    {
        Queue<Point> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty())
        {
            Point p = q.poll();

            if (p.x == 0 || p.x == h - 1 || p.y == 0 || p.y == w - 1)
                return dist[p.x][p.y];

            for (int dir = 0; dir < 4; dir++)
            {
                int nx = p.x + dx[dir];
                int ny = p.y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w)
                    continue;
                if (map[nx][ny] == '#' || dist[nx][ny] > 0)
                    continue;

                if (fireTime[nx][ny] != 0 && fireTime[nx][ny] <= dist[p.x][p.y] + 1)
                    continue;

                dist[nx][ny] = dist[p.x][p.y] + 1;
                q.add(new Point(nx, ny));
            }
        }

        return -1;  // 탈출 불가능
    }
}
