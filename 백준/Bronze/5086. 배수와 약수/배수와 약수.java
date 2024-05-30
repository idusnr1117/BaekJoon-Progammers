import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true)
        {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0)
            {
                break;
            }
            check(A, B);
        }
        
    }

    public static void check(int A, int B)
    {
        if (A % B == 0)
        {
            System.out.println("multiple");
            return;
        }
        else if (B % A == 0)
        {
            System.out.println("factor");
            return;
        }
        System.out.println("neither");
    }

}
