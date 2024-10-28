import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());
            // 시작과 끝은 1광년 이동
            // 마지막에 1광년을 이동하기 위해선 K6가 도착지 일 때 K5를 갈 때 0 ~ 2광년을 이동해야함
            // 1 -> 2 -> 4 -> 5
            // 0 -> 1 -> 2 -> 3
            // 45 -> 46 -> 48 -> 49 -> 50
            // 45 -> 46 -> 47 -> 49 -> 50

            long dist = y - x;
            long min = (long)Math.sqrt(dist);

            if (min == Math.sqrt(dist)) // 부동 소수점 연산으로 인해 정확한 정수인지 확인
                System.out.println(2 * min - 1);
            else if (dist <= min * min + min)
                System.out.println(2 * min);
            else
                System.out.println(2 * min + 1);
        }

    }
}
