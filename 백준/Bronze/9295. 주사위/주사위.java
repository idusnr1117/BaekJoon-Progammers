import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 1; i <= N; i++)
        {
            st = new StringTokenizer(br.readLine());

            System.out.printf("Case %d: %d\n", i, Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }


    }
}
