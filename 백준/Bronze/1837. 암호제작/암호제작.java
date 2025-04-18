import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String P = st.nextToken();
        int K = Integer.parseInt(st.nextToken());

        boolean check = false;

        int num = 0;

        for (int i = 2; i < K; i++)
        {
            if (new BigInteger(P).mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO))
            {
                num = i;
                check = true;
                break;
            }
        }

        if (check)
            System.out.println("BAD " + num);
        else
            System.out.println("GOOD");

    }
}
