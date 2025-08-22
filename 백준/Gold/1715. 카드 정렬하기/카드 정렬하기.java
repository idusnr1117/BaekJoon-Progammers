import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++)
            queue.add(Integer.parseInt(br.readLine()));

        int sum = 0;

        while (queue.size() != 1)
        {
            int a = queue.poll();
            int b = queue.poll();
            queue.add(a + b);
            sum += a + b;
        }

        System.out.println(sum);

    }
}
