import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = Math.max(a, Math.max(b, c));

            if (a == 0 && b == 0 && c == 0)
            {
                break;
            }
            else if
            (
                (max == a && a >= b + c) ||
                (max == b && b >= a + c) ||
                (max == c && c >= a + b)
            )
            {
                System.out.println("Invalid");
            }
            else if (a == b && b == c)
            {
                System.out.println("Equilateral");
            }
            else if (a == b || b == c || a == c)
            {
                System.out.println("Isosceles");
            }
            else
            {
                System.out.println("Scalene");
            }
        }


    }
}
