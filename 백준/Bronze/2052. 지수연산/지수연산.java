import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0)
        {
            System.out.println(1);
            return;
        }

        BigInteger fivePowN = BigInteger.valueOf(5).pow(N);
        String s = fivePowN.toString();

        String sb = "0".repeat(Math.max(0, N - s.length())) + s;

        System.out.println("0." + sb);
    }
}
