import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            String N = br.readLine();
            String square = String.valueOf(Integer.parseInt(N) * Integer.parseInt(N));

            if (square.endsWith(N))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
