import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int computer = Integer.parseInt(st.nextToken());
            int cable = Integer.parseInt(st.nextToken());

            System.out.printf("Case %d: %d\n", i, cable - computer + 1);
        }

    }
}
