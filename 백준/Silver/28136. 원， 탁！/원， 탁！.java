import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N + 1];
        int tak = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            a[i] = Integer.parseInt(st.nextToken());
        }

        a[N] = a[0];

        for (int i = 0; i < N; i++)
        {
            if (a[i] >= a[i + 1])
            {
                tak++;
            }
        }

        System.out.println(tak);

    }
}
