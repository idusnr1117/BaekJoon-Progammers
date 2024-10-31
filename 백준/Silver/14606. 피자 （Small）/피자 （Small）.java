import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(N);

        while (!stack.isEmpty())
        {
            int temp = stack.pop();
            if (temp == 1) continue;

            int b = temp / 2;
            int c = temp - b;
            sum += b * c;
            stack.push(b);
            stack.push(c);
        }

        System.out.println(sum);

    }
}
