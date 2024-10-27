import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] applePie = new int[N];

        for (int i = 0; i < N; i++)
            applePie[i] = Integer.parseInt(st.nextToken());

        int current = 0;

        for (int i = 0; i < K; i++)
            current += applePie[i];

        int max = current;

        for (int i = 1; i < N; i++)
        {
            current = current - applePie[i - 1] + applePie[(i + K - 1) % N];
            max = Math.max(max, current);
        }

        System.out.println(max);

    }
}
