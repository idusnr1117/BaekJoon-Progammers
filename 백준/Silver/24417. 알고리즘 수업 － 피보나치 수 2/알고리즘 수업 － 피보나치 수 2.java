import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long a = 1;
        long b = 1;

        if (N == 1 || N == 2)
        {
            System.out.println(1 + " 0");
            return;
        }

        for (int i = 3; i <= N; i++)
        {
            long temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }

        System.out.println(b + " " + (N - 2));

    }
}
