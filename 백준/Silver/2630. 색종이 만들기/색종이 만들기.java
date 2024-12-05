import java.io.*;
import java.util.*;

public class Main {

    static int[][] paper; // 색종이 데이터 저장
    static int white = 0; // 흰색 색종이 개수
    static int blue = 0;  // 파란색 색종이 개수

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        // 종이 데이터 입력
        for (int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                paper[i][j] = Integer.parseInt(st.nextToken());
        }

        // 분할 정복 시작
        divide(0, 0, n);

        // 결과 출력
        System.out.println(white);
        System.out.println(blue);
    }

    // 분할 정복 메서드
    static void divide(int x, int y, int size)
    {
        if (isSameColor(x, y, size)) // 같은 색인지 확인
        {
            if (paper[x][y] == 0)
                white++;
            else
                blue++;
            return;
        }

        // 4등분하여 재귀 호출
        int newSize = size / 2;
        divide(x, y, newSize); // 왼쪽 위
        divide(x, y + newSize, newSize); // 오른쪽 위
        divide(x + newSize, y, newSize); // 왼쪽 아래
        divide(x + newSize, y + newSize, newSize); // 오른쪽 아래
    }

    // 영역이 같은 색인지 확인
    static boolean isSameColor(int x, int y, int size)
    {
        int color = paper[x][y];

        for (int i = x; i < x + size; i++)
            for (int j = y; j < y + size; j++)
                if (paper[i][j] != color)
                    return false;

        return true;
    }

}
