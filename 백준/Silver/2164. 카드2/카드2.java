import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++)
        {
            deque.add(i);
        }

        while(deque.size() != 1)
        {
            deque.pollFirst();
            deque.add(deque.pollFirst());
        }

        System.out.println(deque.peekFirst());

    }
}
