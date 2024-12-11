import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            String operator = st.nextToken();
            long b = Long.parseLong(st.nextToken());
            st.nextToken();
            long answer = Long.parseLong(st.nextToken());

            if (operator.equals("+")) System.out.println(a + b == answer ? "correct" : "wrong answer");
            else if (operator.equals("-")) System.out.println(a - b == answer ? "correct" : "wrong answer");
            else if (operator.equals("*")) System.out.println(a * b == answer ? "correct" : "wrong answer");
            else System.out.println(a / b == answer ? "correct" : "wrong answer");
        }

    }
}
