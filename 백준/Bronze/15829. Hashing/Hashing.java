import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[] alphabets = br.readLine().toCharArray();

        BigInteger hash = new BigInteger("0");
        BigInteger r = new BigInteger("31");
        BigInteger mod = new BigInteger("1234567891");

        for (int i = 0; i < alphabets.length; i++)
        {
            BigInteger ch = BigInteger.valueOf((alphabets[i] - 'a') + 1);

            hash = hash.add(r.pow(i).multiply(ch));
        }

        System.out.println(hash.mod(mod));

    }
}
