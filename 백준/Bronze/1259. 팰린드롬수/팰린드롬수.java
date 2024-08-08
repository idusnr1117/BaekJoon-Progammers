import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String str = br.readLine();
            String reverse = "";
            if (str.equals("0"))
            {
                break;
            }

            for (int i = str.length() - 1; -1 < i; i--)
            {
                reverse += str.charAt(i);
            }

            if (str.equals(reverse))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }

    }
}
