import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] shirt = new int[6];

        for (int i = 0; i < 6; i ++)
        {
            shirt[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int shirtSet = 0;

        for (int size : shirt)
        {
            while (0 < size)
            {
                size -= T;
                shirtSet++;
            }
        }

        System.out.println(shirtSet);
        System.out.printf("%d %d", N / P, N % P);

    }
}
