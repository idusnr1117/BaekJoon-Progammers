import java.io.*;

public class Main {
    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(fibo(n));
    }

    static long fibo(long n)
    {
        if (n == 0) return 0;

        long[][] result = {{1, 0}, {0, 1}}; // 단위 행렬
        long[][] base = {{1, 1}, {1, 0}};

        while (n > 0)
        {
            if (n % 2 == 1)
                result = multiply(result, base);
            base = multiply(base, base);
            n /= 2;
        }

        return result[0][1]; // F(n)
    }

    static long[][] multiply(long[][] a, long[][] b)
    {
        long[][] result = new long[2][2];

        result[0][0] = (a[0][0] * b[0][0] % MOD + a[0][1] * b[1][0] % MOD) % MOD;
        result[0][1] = (a[0][0] * b[0][1] % MOD + a[0][1] * b[1][1] % MOD) % MOD;
        result[1][0] = (a[1][0] * b[0][0] % MOD + a[1][1] * b[1][0] % MOD) % MOD;
        result[1][1] = (a[1][0] * b[0][1] % MOD + a[1][1] * b[1][1] % MOD) % MOD;

        return result;
    }

}
