import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0)
        {
            System.out.println(0);
            return;
        }

        long a = 0;
        long b = 1;

        for (int i = 2; i <= N; i++)
        {
            long temp = b;
            b = (a + b) % 1000000007;
            a = temp;
        }

        System.out.println(b);

    }
}
