import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        System.out.println(A.multiply(B));

    }
}
