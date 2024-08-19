import java.io.*;
import java.util.*;

public class Main {

    public static void main(String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int odds = 0;
        int evens = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            int a = Integer.parseInt(st.nextToken());
            if (a % 2 == 0)
            {
                evens++;
            }
            else
            {
                odds++;
            }
        }

        if (N % 2 == 1)
        {
            if (N / 2 + 1 == odds && N / 2 == evens)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
        else
        {
            if (N / 2 == odds && N / 2 == evens)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }

    }
}