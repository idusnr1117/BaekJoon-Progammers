import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = new String[3];

        for (int i = 0; i < 3; i++)
        {
            strs[i] = br.readLine();
        }

        for (int i = 0; i < 3; i++)
        {
            if (!strs[i].equals("Fizz") && !strs[i].equals("Buzz") && !strs[i].equals("FizzBuzz"))
            {
                int num = Integer.parseInt(strs[i]);
                num += 3 - i;
                if (num % 3 == 0 && num % 5 == 0)
                {
                    System.out.println("FizzBuzz");
                    break;
                }
                else if (num % 3 == 0)
                {
                    System.out.println("Fizz");
                    break;
                }
                else if (num % 5 == 0)
                {
                    System.out.println("Buzz");
                    break;
                }
                else
                {
                    System.out.println(num);
                    break;
                }
            }
        }

    }
}
