import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] answer = new int[N];

        int start = 0;
        int end = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            answer[i] = Integer.parseInt(st.nextToken());
            if (start < answer[i])
                start = answer[i];
            end += answer[i];
        }

        while (start <= end)
        {
            int middle = (start + end) / 2;
            int sum = 0;
            int cnt = 0;
            for (int i = 0; i < N; i++)
            {
                if (sum + answer[i] > middle)
                {
                    cnt++;
                    sum = 0;
                }
                sum += answer[i];
            }
            if (sum != 0)
                cnt++;
            if (cnt > M)
                start = middle + 1;
            else
                end = middle - 1;
        }

        System.out.println(start);

    }
}
