import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] ans = new int[N];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(str[i]);

        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        for (int i = 1; i < N; i++)
        {
            while (!stack.isEmpty() && A[stack.peek()] < A[i])
                ans[stack.pop()] = A[i];
            stack.push(i);
        }

        while (!stack.empty())
            ans[stack.pop()] = -1;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++)
            bw.write(ans[i] + " ");

        bw.flush();
        bw.close();

    }
}
