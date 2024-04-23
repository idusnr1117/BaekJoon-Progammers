import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split("");
        int M = Integer.parseInt(br.readLine());
        Stack<String> left_stack = new Stack<>();
        Stack<String> right_stack = new Stack<>();

        for(String str : strs) left_stack.push(str);

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command) {
                case "L":
                    if(!left_stack.isEmpty()) right_stack.push(left_stack.pop());
                    break;
                case "D":
                    if(!right_stack.isEmpty()) left_stack.push(right_stack.pop());
                    break;
                case "B":
                    if(!left_stack.isEmpty())  left_stack.pop();
                    break;
                case "P":
                    String str = st.nextToken();
                    left_stack.push(str);
                    break;
            }
        }

        while(!left_stack.isEmpty()) right_stack.push(left_stack.pop());
        while(!right_stack.isEmpty()) bw.write(right_stack.pop());

        bw.flush();

    }
}