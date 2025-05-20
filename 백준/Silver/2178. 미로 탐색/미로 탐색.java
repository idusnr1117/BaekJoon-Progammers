import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int N, M; // N: 가로, M: 세로

    static int[] dx = {-1, 1, 0, 0}; // 상하
    static int[] dy = {0, 0, -1, 1}; // 좌우

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 행 (줄 수)
        N = Integer.parseInt(st.nextToken()); // 열 (한 줄 길이

        map = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++)
        {
            String line = br.readLine();
            for (int j = 0; j < N; j++)
                map[i][j] = line.charAt(j) - '0';
        }

        bfs(0, 0);

    }

    public static void bfs(int startX, int startY)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 1}); // 세 번째 값: 거리(시작점은 1)
        visited[startX][startY] = true;

        while (!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int dist = curr[2]; // 현재까지 거리

            if (x == M - 1 && y == N - 1)
            {
                System.out.println(dist);
                return;
            }

            for (int i = 0; i < 4; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (!visited[nx][ny] && map[nx][ny] == 1)
                {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, dist + 1});
                }
            }
        }
        System.out.println("No"); // 도달 불가능 시 출력 (필요 시)
    }

}
