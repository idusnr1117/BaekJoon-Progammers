import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        char[] alphabets = new char[N];
        int[] nums = new int[N];
        char alpha = 'A';
        String[] strs = bf.readLine().split("");
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < N; i++) alphabets[i] = alpha++;

        for (int i = 0; i < N; i++) nums[i] = Integer.parseInt(bf.readLine());

        for (String str : strs) {
            char ch = str.charAt(0);
            if (Character.isAlphabetic(ch)) stack.push((double)nums[ch - 'A']);
            else
            {
                double b = stack.pop();
                double a = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}

