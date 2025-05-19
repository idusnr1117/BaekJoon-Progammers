import java.util.*;

public class Main {

    static int[][] board;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new int[N][N];
        visited = new boolean[N][N];

        // 게임판 입력 받기
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = sc.nextInt();

        // BFS 탐색
        boolean result = bfs(0, 0);
        System.out.println(result ? "HaruHaru" : "Hing");

    }

    static boolean bfs(int startX, int startY)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty())
        {
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];

            int jump = board[x][y];
            if (jump == -1) return true;

            // 아래쪽 이동
            int nx = x + jump;
            int ny = y;
            if (nx < N && !visited[nx][ny])
            {
                queue.add(new int[]{nx, ny});
                visited[nx][ny] = true;
            }

            // 오른쪽 이동
            nx = x;
            ny = y + jump;
            if (ny < N && !visited[nx][ny])
            {
                queue.add(new int[]{nx, ny});
                visited[nx][ny] = true;
            }
        }

        return false; // 도달하지 못함

    }

}
