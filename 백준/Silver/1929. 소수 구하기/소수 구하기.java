import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        isPrime(M, N);

    }

    public static void isPrime(int n, int m)
    {
        if (m < 2 || n > m)
            return;

        boolean[] composite = new boolean[m + 1];
        int limit = (int) Math.sqrt(m);

        // 에라토스테네스의 체
        for (int i = 2; i <= limit; i++)
            if (!composite[i])
                for (int j = i * i; j <= m; j += i)
                    composite[j] = true;

        // 결과 출력
        for (int i = Math.max(2, n); i <= m; i++)
            if (!composite[i])
                System.out.println(i);

    }

}
