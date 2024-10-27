import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ticket = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (ticket < 2023)
        {
            System.out.println(0);
            System.exit(0);
        }

        Pattern pattern = Pattern.compile(".*2.*0.*2.*3.*");

        for (int i = 2023; i <= ticket; i++)
        {
            String serial = Integer.toString(i);
            if (pattern.matcher(serial).matches())
                cnt++;
        }

        System.out.println(cnt);

    }
}
