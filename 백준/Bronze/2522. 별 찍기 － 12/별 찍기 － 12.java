import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++)
        {
            System.out.print(" ".repeat(N - i));
            System.out.println("*".repeat(i));
        }

        for (int i = N - 1; 0 < i; i--)
        {
            System.out.print(" ".repeat(N - i));
            System.out.println("*".repeat(i));
        }

    }
}
