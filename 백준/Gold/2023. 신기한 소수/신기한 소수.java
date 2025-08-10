import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

    }

    static void dfs (int number, int jaritsu)
    {
        if (jaritsu == N)
        {
            if (isPrime(number))
                System.out.println(number);
            return;
        }

        for (int i = 1; i < 10; i++)
        {
            if (i % 2 == 0)
                continue;

            if (isPrime(number * 10 + i))
                dfs(number * 10 + i , jaritsu + 1);
        }
    }

    static boolean isPrime(int num)
    {
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }

}
