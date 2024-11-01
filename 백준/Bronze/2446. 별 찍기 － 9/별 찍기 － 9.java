import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int first = N * 2 - 1;

        for (int i = first; 0 < i; i-=2)
        {
            System.out.print(" ".repeat((first - i) / 2));
            System.out.println("*".repeat(i));
        }

        for (int i = 3; i <= first; i+=2)
        {
            System.out.print(" ".repeat((first - i) / 2));
            System.out.println("*".repeat(i));
        }

    }
}
