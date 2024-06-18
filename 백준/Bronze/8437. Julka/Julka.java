import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger apple = new BigInteger(br.readLine());
        BigInteger more_apple = new BigInteger(br.readLine());

        apple = apple.subtract(more_apple);

        System.out.println(apple.divide(BigInteger.valueOf(2)).add(more_apple));
        System.out.println(apple.divide(BigInteger.valueOf(2)));

    }
}
