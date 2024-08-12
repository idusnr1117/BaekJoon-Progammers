import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));

    }

    private static int factorial(int n)
    {
        int result = 1;
        if (n <= 1)
        {
            return 1;
        }
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

}
