import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", c / v, c % v);
        }

    }
}
