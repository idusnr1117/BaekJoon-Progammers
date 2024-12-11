import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = br.readLine()) != null)
        {
            while (str.contains("BUG"))
                str = str.replace("BUG", "");
            System.out.println(str);
        }

    }
}
