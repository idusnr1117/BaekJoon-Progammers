import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        int num = 0;

        for (int i = 0; i < N.length(); i++)
            num = (num * 10 + (N.charAt(i) - '0')) % 20000303;

        System.out.println(num);

    }
}
