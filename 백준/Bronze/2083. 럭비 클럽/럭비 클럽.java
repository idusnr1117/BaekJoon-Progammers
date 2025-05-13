import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while (!(str = br.readLine()).equals("# 0 0"))
        {
            String[] s = str.split(" ");
            String name = s[0];
            int age = Integer.parseInt(s[1]);
            int kg = Integer.parseInt(s[2]);

            if (age > 17 || kg >= 80)
                System.out.println(name + " Senior");
            else
                System.out.println(name + " Junior");
        }

    }
}
