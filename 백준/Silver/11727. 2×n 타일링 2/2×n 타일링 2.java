import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] tile = new int[N + 3];

        tile[1] = 1;
        tile[2] = 3;
        tile[3] = 5;

        for (int i = 3; i <= N; i++)
        {
            tile[i] = (tile[i - 1] +  2 * tile[i - 2]) % 10007;
        }

        System.out.println(tile[N]);

    }
}
