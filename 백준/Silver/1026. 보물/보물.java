import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Integer[] A = new Integer[N];
        int[] B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            B[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B);

        int sum = 0;

        for (int i = 0; i < N; i++)
            sum += A[i] * B[i];

        System.out.println(sum);

    }
}
