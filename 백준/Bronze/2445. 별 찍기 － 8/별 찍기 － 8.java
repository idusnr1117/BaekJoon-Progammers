import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) * 2;

        for (int i = 1; i <= N / 2; i++)
        {
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(N - (i * 2)));
            System.out.println("*".repeat(i));
        }

        for (int i = N / 2 - 1; 0 < i; i--)
        {
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(N - (i * 2)));
            System.out.println("*".repeat(i));
        }

    }
}
