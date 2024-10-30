import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            String cryptoquote = br.readLine();
            String rule = br.readLine();

            StringBuilder sb = new StringBuilder();

            for (char ch : cryptoquote.toCharArray())
            {
                if (ch == ' ')
                    sb.append(" ");
                else
                    sb.append(rule.charAt(ch - 'A'));
            }

            System.out.println(sb);
        }

    }
}
