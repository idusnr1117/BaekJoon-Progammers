import java.io.*;
import java.util.*;

public class Main {

    static final int MAX = 20000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> primes = getPrimes(MAX);

        for (int i = 0; i < primes.size() - 1; i++)
        {
            int p = primes.get(i);
            int q = primes.get(i + 1);
            int product = p * q;

            if (product > N)
            {
                System.out.println(product);
                return;
            }
        }

    }

    // 에라토스테네스의 체
    private static List<Integer> getPrimes(int limit)
    {
        boolean[] isComposite = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++)
        {
            if (!isComposite[i])
            {
                primes.add(i);
                for (int j = i * 2; j <= limit; j += i)
                {
                    isComposite[j] = true;
                }
            }
        }

        return primes;
    }

}
