import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        if (max > a && a > min)
        {
            System.out.println(a);
        }
        else if (max > b && b > min)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
        
    }
}
