import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true)
        {
            int a = Integer.parseInt(br.readLine());
            if (a == 0)
            {
                break;
            }
            int sum = 0;
            for (int i = 1; i <= a; i++)
            {
                sum += i;
            }
            System.out.println(sum);
        }

    }
}
