import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while (!(str = br.readLine()).equals("#"))
        {
            str = str.toLowerCase();
            int a = str.length() - str.replace("a", "").length();
            int e = str.length() - str.replace("e", "").length();
            int i = str.length() - str.replace("i", "").length();
            int o = str.length() - str.replace("o", "").length();
            int u = str.length() - str.replace("u", "").length();

            System.out.println(a + e + i + o + u);
        }

    }
}
