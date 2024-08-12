import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= N; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        char[] fact = String.valueOf(factorial).toCharArray();

        long cnt = 0;

        for (int i = fact.length - 1; 0 < i; i--)
        {
            if (fact[i] == '0')
            {
                cnt++;
            }
            else
            {
                break;
            }
        }

        System.out.println(cnt);

    }
}
