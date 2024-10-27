import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1)
            System.out.println("*");
        else
        {
            for (int i = 1; i <= N; i++)
            {
                if (i % 2 == 0)
                    System.out.println(" *".repeat(N));
                else
                    System.out.println("* ".repeat(N));
            }
        }

    }
}
