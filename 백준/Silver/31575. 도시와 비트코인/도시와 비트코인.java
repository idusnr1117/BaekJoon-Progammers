import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[][] map = new int[M][N];

        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];

        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        int[] dx = {0, 1};
        int[] dy = {1, 0};

        while (!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

            if (x == M - 1 && y == N - 1)
            {
                System.out.println("Yes");
                System.exit(0);
            }

            for (int i = 0; i < 2; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && map[nx][ny] == 1 && !visited[nx][ny])
                {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        System.out.println("No");



    }
}
