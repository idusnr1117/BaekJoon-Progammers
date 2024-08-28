import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N ;i++)
        {
            int num = 0;
            int front = 0;
            char[] chars = br.readLine().toCharArray();
            for (char ch : chars)
            {
                if (ch == '!')
                {
                    front++;
                }
                else
                {
                    num = ch - 48;
                    break;
                }
            }

            int back = chars.length - front - 1;

            if (back > 0)
            {
                num = 1;
            }
            if (front % 2 == 0)
            {
                if (num == 1)
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
                if (num == 1)
                {
                    System.out.println(0);
                }
                else
                {
                    System.out.println(1);
                }
            }

        }


    }
}
