import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long plus = 1;
        long result = 1;

        for (int i = 0; i < B; i++)
        {
            plus += A - 2;
            result += plus;
        }

        System.out.println(result);

    }
}
