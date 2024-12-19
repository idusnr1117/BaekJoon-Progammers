import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strs = new ArrayList<>();
        char[] chars = br.readLine().toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < chars.length; j++)
                str.append(chars[j]);
            strs.add(String.valueOf(str));
        }

        Collections.sort(strs);

        for (String s : strs)
            System.out.println(s);

    }
}
