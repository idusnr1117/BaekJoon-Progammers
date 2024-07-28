import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] chars = {'a', 'e', 'i', 'o', 'u'};

        int cnt = 0;

        for (char ch : chars)
        {
            cnt += str.length() - str.replace(String.valueOf(ch), "").length();
        }

        System.out.println(cnt);

    }
}
