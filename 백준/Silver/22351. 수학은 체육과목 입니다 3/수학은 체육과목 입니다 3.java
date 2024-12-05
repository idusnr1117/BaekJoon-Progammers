import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int len = str.length();

        for (int i = Integer.parseInt(str.substring(0, 1)); i < 1000; i++)
        {
            StringBuilder sb = new StringBuilder();
            int current = i;

            while (sb.length() < len)
            {
                sb.append(current);
                current++;
            }

            if (sb.toString().equals(str))
            {
                System.out.println(i + " " + (current - 1));
                return;
            }
        }

    }
}
