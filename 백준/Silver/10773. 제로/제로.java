import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++)
        {
            int a = Integer.parseInt(br.readLine());
            if (a == 0)
            {
                stack.pop();
            }
            else
            {
                stack.push(a);
            }
        }

        int sum = 0;
        for (int num : stack)
        {
            sum += num;
        }

        System.out.println(sum);

    }
}
