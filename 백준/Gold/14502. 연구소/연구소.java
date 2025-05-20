import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] map;
    static List<int[]> blanks = new ArrayList<>();
    static List<int[]> viruses = new ArrayList<>();
    static int maxSafeArea = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        readInput();
        makeWallCombinations(0, 0);
        System.out.println(maxSafeArea);
    }

    static void readInput() throws IOException { // 값 입력
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 0)
                    blanks.add(new int[]{i, j});
                else if (map[i][j] == 2)
                    viruses.add(new int[]{i, j});
            }
        }
    }

    static void makeWallCombinations(int start, int depth)
    {
        if (depth == 3)
        {
            int[][] copyMap = copyMap();
            spreadVirus(copyMap);
            int safe = countSafeArea(copyMap);
            maxSafeArea = Math.max(maxSafeArea, safe);
            return;
        }

        for (int i = start; i < blanks.size(); i++)
        {
            int[] pos = blanks.get(i);
            map[pos[0]][pos[1]] = 1; // 벽 세우기
            makeWallCombinations(i + 1, depth + 1);
            map[pos[0]][pos[1]] = 0; // 벽 되돌리기
        }
    }

    static int[][] copyMap()
    {
        int[][] copy = new int[N][M];

        for (int i = 0; i < N; i++)
            copy[i] = map[i].clone();

        return copy;
    }

    static void spreadVirus(int[][] copy)
    {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        for (int[] virus : viruses)
        {
            queue.add(virus);
            visited[virus[0]][virus[1]] = true;
        }

        while (!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

            for (int i = 0; i < 4; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M)
                {
                    if (!visited[nx][ny] && copy[nx][ny] == 0)
                    {
                        visited[nx][ny] = true;
                        copy[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    static int countSafeArea(int[][] copy)
    {
        int count = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (copy[i][j] == 0)
                    count++;
        return count;
    }

}
