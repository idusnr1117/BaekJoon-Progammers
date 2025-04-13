import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++)
        {
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for (int j = 0; j < N; j++)
                sum = sum.add(new BigInteger(br.readLine()));
            System.out.println(sum.compareTo(BigInteger.ZERO) == 0 ? "0" : sum.compareTo(BigInteger.ZERO) == 1 ? "+" : "-");
        }

    }
}
