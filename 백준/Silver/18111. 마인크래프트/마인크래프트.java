import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] land = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                land[i][j] = Integer.parseInt(st.nextToken());
        }

        int minTime = Integer.MAX_VALUE;
        int maxHeight = -1;

        // 가장 적합한 높이와 최소 시간 계산
        for (int height = 0; height <= 256; height++)
        {
            int time = 0;
            int inventory = B;

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    int diff = land[i][j] - height;
                    if (diff > 0)
                    { // 블록을 제거
                        time += 2 * diff;
                        inventory += diff;
                    }
                    else if (diff < 0) // 블록을 추가
                    {
                        time -= diff;  // diff는 음수이므로 뺄셈으로 블록 추가
                        inventory += diff;
                    }
                }
            }

            // 인벤토리가 부족하면 이 높이는 불가능
            if (inventory < 0) continue;

            // 최소 시간, 또는 시간은 같지만 높은 높이로 업데이트
            if (time <= minTime)
            {
                minTime = time;
                maxHeight = height;
            }
        }
        
        System.out.println(minTime + " " + maxHeight);

    }
}
