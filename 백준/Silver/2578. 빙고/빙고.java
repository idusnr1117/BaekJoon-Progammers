import java.io.*;
import java.util.*;

public class Main {

    static int[][] board = new int[5][5]; // 보드판
    static boolean[][] marked = new boolean[5][5]; // 체크된 칸 표시

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 5x5 숫자 입력
        for (int i = 0; i < 5; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
                board[i][j] = Integer.parseInt(st.nextToken());
        }

        int count = 0; // 부른 숫자 개수

        // 사회자가 부르는 숫자 5줄 입력
        for (int i = 0; i < 5; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
            {
                int called = Integer.parseInt(st.nextToken());
                count++;

                markNumber(called);

                if (countBingo() >= 3)
                {
                    System.out.println(count);
                    return;
                }
            }
        }
    }

    // called 숫자 체크
    static void markNumber(int num)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (board[i][j] == num)
                {
                    marked[i][j] = true;
                    return; // 찾으면 바로 끝
                }
            }
        }
    }

    // 빙고 줄 세기
    static int countBingo() {
        int bingo = 0;

        // 가로 체크
        for (int i = 0; i < 5; i++)
        {
            boolean complete = true;
            for (int j = 0; j < 5; j++)
            {
                if (!marked[i][j])
                {
                    complete = false;
                    break;
                }
            }
            if (complete)
                bingo++;
        }

        // 세로 체크
        for (int j = 0; j < 5; j++)
        {
            boolean complete = true;
            for (int i = 0; i < 5; i++)
            {
                if (!marked[i][j])
                {
                    complete = false;
                    break;
                }
            }
            if (complete) bingo++;
        }

        // 대각선 체크 (왼쪽 위 ➔ 오른쪽 아래)
        boolean complete = true;
        for (int i = 0; i < 5; i++)
        {
            if (!marked[i][i])
            {
                complete = false;
                break;
            }
        }
        if (complete) bingo++;

        // 대각선 체크 (오른쪽 위 ➔ 왼쪽 아래)
        complete = true;
        for (int i = 0; i < 5; i++)
        {
            if (!marked[i][4 - i])
            {
                complete = false;
                break;
            }
        }
        if (complete) bingo++;

        return bingo;
    }
}
