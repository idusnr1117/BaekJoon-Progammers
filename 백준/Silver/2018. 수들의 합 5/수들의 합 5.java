import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        long beforeTime = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 1;

        for (int i = 1; i < N; i++)
        {
            int sum = 0;
            int j = i;
            while (sum <= N)
            {
                sum += j;
                if (sum == N)
                {
                    cnt++;
                    break;
                }
                j++;
            }
        }

        System.out.println(cnt);

//        long afterTime = System.currentTimeMillis();
//        long secDiffTime = (afterTime - beforeTime) / 1000;
//        System.out.println("시간차이(m) : " + secDiffTime);

    }
}
