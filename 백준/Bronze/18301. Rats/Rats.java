import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken()) + 1;
        int n2 = Integer.parseInt(st.nextToken()) + 1;
        int n12 = Integer.parseInt(st.nextToken()) + 1;

        System.out.println((n1 * n2 / n12) - 1);

    }
}
