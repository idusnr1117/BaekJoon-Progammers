import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 5;
        int total = 0;

        for (int j = 0; j < i; j++)
        {
            int a = Integer.parseInt(br.readLine());
            total += a;
        }

        System.out.println(total);

    }
}
