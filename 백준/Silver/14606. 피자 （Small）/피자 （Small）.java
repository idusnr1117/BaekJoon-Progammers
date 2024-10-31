import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        while (!queue.isEmpty())
        {
            int temp = queue.poll();
            if (temp == 1) continue;

            int b = temp / 2;
            int c = temp - b;
            sum += b * c;
            queue.add(b);
            queue.add(c);
        }

        System.out.println(sum);

    }
}
