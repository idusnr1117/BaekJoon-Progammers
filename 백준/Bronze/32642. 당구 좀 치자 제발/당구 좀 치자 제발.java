import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int rage = 0;
        long answer = 0;

        for (int i = 0; i < N; i++)
        {
            if (st.nextToken().equals("1"))
                rage++;
            else
                rage--;
            answer += rage;
        }

        System.out.println(answer);

    }
}
