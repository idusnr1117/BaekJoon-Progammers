import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int size = 8;

        for (int i = 0; i < N; i++)
        {
            int error = 0;

            String str = br.readLine();

            for (int j = 0; j < str.length(); j += size)
            {
                int cnt = 0;
                String bit = str.substring(j, Math.min(j + size, str.length()));

                for (char ch : bit.toCharArray())
                    if (ch == '1')
                        cnt++;

                if (cnt % 2 != 0)
                    error++;
            }

            System.out.println(error);
        }
    }
}
