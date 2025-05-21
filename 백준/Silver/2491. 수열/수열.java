import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());

        int incLen = 1;
        int decLen = 1;
        int maxLen = 1;

        for (int i = 1; i < N; i++)
        {
            // 비내림차순 (증가 or 같음)
            if (num[i] >= num[i - 1])
                incLen++;
            else
                incLen = 1;

            // 비오름차순 (감소 or 같음)
            if (num[i] <= num[i - 1])
                decLen++;
            else
                decLen = 1;

            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }

        System.out.println(maxLen);
    }
}
