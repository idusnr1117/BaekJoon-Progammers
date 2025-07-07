import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < N; i++)
        {
           String[] strings = br.readLine().trim().split("");

            int num = Integer.parseInt(strings[10] + strings[11] + strings[12]) * 10;
            int sum = 0;


            for (String s : strings)
                sum += Integer.parseInt(s);

            sum += num;

            if (sum < 1000)
                System.out.println(sum + 1000);
            else
            {
                int len = String.valueOf(sum).length();
                System.out.println(String.valueOf(sum).substring(len - 4, len));
            }
        }

    }
}
