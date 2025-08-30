import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            deque.add(i);

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
        {
            int target = Integer.parseInt(st.nextToken());

            int tick = 0;
            while (deque.peekFirst() != target)
            {
                deque.addLast(deque.pollFirst());
                tick++;
            }
            cnt += Math.min(tick, deque.size() - tick);
            deque.pop();
        }

        System.out.println(cnt);

    }
}
