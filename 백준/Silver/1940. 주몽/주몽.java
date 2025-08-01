import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] item = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            item[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(item);

        int cnt = 0;
        int i = 0;
        int j = N - 1;

        while (i < j)
        {
            if (item[i] + item[j] < M)
                i++;
            else if (item[i] + item[j] > M)
                j--;
            else
            {
                cnt++;
                i++;
                j--;
            }
        }

        System.out.println(cnt);

    }
}
