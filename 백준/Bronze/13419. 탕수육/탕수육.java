import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++)
        {
            String word = br.readLine();

            int len = word.length();
            StringBuilder a = new StringBuilder();
            for (int i = 0; i < len; i++)
            {
                int index = (i * 2) % len;
                if (a.indexOf(String.valueOf(word.charAt(index))) == -1)
                    a.append(word.charAt(index));
            }
            sb.append(a).append("\n");

            StringBuilder b = new StringBuilder();
            for (int i = 0; i < len; i++)
            {
                int index = (i * 2 + 1) % len;
                if (b.indexOf(String.valueOf(word.charAt(index))) == -1)
                    b.append(word.charAt(index));
            }
            sb.append(b).append("\n");
        }

        System.out.println(sb);

    }
}
