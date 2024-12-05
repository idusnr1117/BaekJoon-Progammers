import java.io.*;
import java.util.*;

public class Main {

    static int[][] field;  // 배추밭 배열
    static boolean[][] visited;  // 방문 여부 체크
    static int[] dx = {0, 0, -1, 1};  // 상하좌우 이동
    static int[] dy = {-1, 1, 0, 0};  // 상하좌우 이동
    static int M, N;  // 배추밭 크기

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());  // 배추밭의 가로 크기
            N = Integer.parseInt(st.nextToken());  // 배추밭의 세로 크기
            int K = Integer.parseInt(st.nextToken());  // 배추의 개수

            // 배열 초기화
            field = new int[N][M];
            visited = new boolean[N][M];

            // 배열 입력
            for (int i = 0; i < K; i++)
            {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());;
                int y = Integer.parseInt(st.nextToken());;
                field[y][x] = 1;  // 배추가 심어진 곳 표시
            }

            int worm = 0;

            // 배추밭을 순회하며 BFS로
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    if (field[i][j] == 1 && !visited[i][j])
                    {
                        bfs(i, j);  // 새로운 연결 요소 탐색
                        worm++;
                    }
                }
            }

            System.out.println(worm);
        }
    }

    // BFS
    static void bfs(int y, int x)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;

        while (!queue.isEmpty())
        {
            int[] current = queue.poll();
            int curY = current[0];
            int curX = current[1];

            // 상하좌우로 이동
            for (int i = 0; i < 4; i++) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];

                // 배추밭 범위 내에 있고, 방문하지 않았으며, 배추가 심어져 있는 경우
                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < M)
                {
                    if (field[nextY][nextX] == 1 && !visited[nextY][nextX])
                    {
                        visited[nextY][nextX] = true;
                        queue.add(new int[]{nextY, nextX});
                    }
                }
            }
        }
    }

}
