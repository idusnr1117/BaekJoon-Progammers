import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) * 2;

        for (int i = 1; i < N; i+=2)
        {
            System.out.print(" ".repeat((N - i) / 2));
            System.out.println("*".repeat(i));
        }

    }
}
