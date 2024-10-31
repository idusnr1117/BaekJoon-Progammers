import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 플레이어 수
        int M = Integer.parseInt(st.nextToken()); // 카드 수

        int[][] cards = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                cards[i][j] = Integer.parseInt(st.nextToken());
            Arrays.sort(cards[i]);
        }

        int[] scores = new int[N];

        for (int i = 0; i < M; i++)
        {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < N; j++)
                max = Math.max(max, cards[j][i]);
            for (int j = 0; j < N; j++)
            {
                if (cards[j][i] == max)
                    scores[j]++;
            }
        }

        for (int i = 0; i < N; i++)
        {
            if (scores[i] == Arrays.stream(scores).max().getAsInt())
                System.out.print((i + 1) + " ");
        }

    }
}
