import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int S = br.readLine().replace("a", "").replace("i", "").replace("u", "").replace("e", "").replace("o", "").length();

        System.out.println(N - S);

    }
}
