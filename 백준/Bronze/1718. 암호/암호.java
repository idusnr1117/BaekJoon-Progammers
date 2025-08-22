import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String key = br.readLine();

        StringBuilder sb = new StringBuilder(s.length());

        int j = 0;
        int m = key.length();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == ' ')
                sb.append(' ');
            else
            {
                int shift = (key.charAt(j) - 'a') + 1;
                int v = c - shift;
                if (v < 'a')
                    v += 26;
                sb.append((char) v);
            }
            j = (j + 1) % m;
        }

        System.out.print(sb);

    }
}
