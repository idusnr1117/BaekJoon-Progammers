import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static class Ice
    {
        int x;
        int y;
        int height;

        public Ice(int x, int y, int height)
        {
            this.x = x;
            this.y = y;
            this.height = height;
        }

    }

    static ArrayList<Ice> ices = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int M;
    static int[][] graph;
    static int[][] point = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
            {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] > 0)
                {
                    ices.add(new Ice(i, j, graph[i][j]));
                }
            }
        }

        for (int year = 0; ; year++)
        {
            for (Ice ice : ices)
            {
                int sea_cnt = 0;
                for (int[] dir : point)
                {
                    int nx = ice.x + dir[0];
                    int ny = ice.y + dir[1];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && graph[nx][ny] == 0)
                    {
                        sea_cnt++;
                    }
                }
                ice.height = Math.max(0, ice.height - sea_cnt);
            }

            for (int i = ices.size() - 1; i >= 0; i--)
            {
                if (ices.get(i).height <= 0)
                {
                    ices.remove(i);
                }
            }

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    graph[i][j] = 0;
                }
            }

            for (Ice ice : ices)
            {
                graph[ice.x][ice.y] = ice.height;
            }

            if (ices.isEmpty())
            {
                System.out.println(0);
                return;
            }

            boolean[][] visited = new boolean[N][M];
            int count = 0;

            for (Ice ice : ices)
            {
                if (!visited[ice.x][ice.y] && graph[ice.x][ice.y] > 0)
                {
                    dfs(ice.x, ice.y, visited);
                    count++;
                    if (count >= 2)
                    {
                        System.out.println(year + 1);
                        return;
                    }
                }
            }
        }

    }

    public static void dfs(int x, int y, boolean[][] visited)
    {
        visited[x][y] = true;
        for (int[] dir : point)
        {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && graph[nx][ny] > 0)
            {
                dfs(nx, ny, visited);
            }
        }
    }

}
