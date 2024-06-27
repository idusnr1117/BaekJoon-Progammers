import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long answer;
//      442222
//      33222
//      2222
//      1111

        if (N == 1)
        {
            answer = 4L;
        }
        else
        {
            answer = N + N + N * 2;
        }

        System.out.println(answer);

    }
}
