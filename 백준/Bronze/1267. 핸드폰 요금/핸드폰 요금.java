import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y = 0;
        int M = 0;

        while (st.hasMoreTokens())
        {
            int T = Integer.parseInt(st.nextToken());
            Y += T / 30 * 10;
            M += T / 60 * 15;
            if (T % 30 >= 0)
                Y += 10;
            if (T % 60 >= 0)
                M += 15;
        }

        if (Y == M)
            System.out.println("Y M " + Y);
        else if (Y < M)
            System.out.println("Y " + Y);
        else
            System.out.println("M " + M);

    }
}
