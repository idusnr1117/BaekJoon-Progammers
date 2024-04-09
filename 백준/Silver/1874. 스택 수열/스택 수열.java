import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1, N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int su = sc.nextInt();
            while (num <= su) { stack.push(num++); bf.append("+\n"); }
            if (stack.isEmpty() || stack.peek() > su) { System.out.println("NO"); return; }
            stack.pop();
            bf.append("-\n");
        }
        System.out.println(bf);
    }
}
