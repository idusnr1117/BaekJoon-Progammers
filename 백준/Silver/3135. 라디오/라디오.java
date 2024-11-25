import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine()) + 1;
        int[] MHz = new int[N];
        MHz[0] = A;
        int cnt = 0;

        for (int i = 1; i < N; i++)
            MHz[i] = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < N; i++)
        {
            int num = Math.abs(MHz[i] - B);
            if (min > num)
            {
                min = num;
                index = i;
            }
        }

        if (MHz[index] != A)
            cnt++;

        System.out.println(cnt + Math.abs(B - MHz[index]));

    }
}
