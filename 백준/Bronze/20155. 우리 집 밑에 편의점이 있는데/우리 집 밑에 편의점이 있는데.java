import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] brand = new int[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            brand[Integer.parseInt(st.nextToken()) - 1]++;
        }

        System.out.println(Arrays.stream(brand).max().getAsInt());

    }
}
