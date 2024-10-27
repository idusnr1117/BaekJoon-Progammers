import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            int len = Integer.parseInt(br.readLine());
            String str = br.readLine();
            while (str.contains("ABB"))
                str = str.replace("ABB", "BA");

            System.out.println(str);
        }

    }
}
