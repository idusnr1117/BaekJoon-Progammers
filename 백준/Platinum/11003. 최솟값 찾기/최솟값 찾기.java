import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        public int index;
        public int value;

        Node(int index, int value)
        {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<Node> nodeDeque = new LinkedList<>();

        for (int i = 0; i < N; i++)
        {
            int now = Integer.parseInt(st.nextToken());

            while (!nodeDeque.isEmpty() && nodeDeque.getLast().value > now)
                nodeDeque.removeLast();

            nodeDeque.addLast(new Node(i, now));

            if (nodeDeque.getFirst().index <= i - L)
                nodeDeque.removeFirst();

            bw.write(nodeDeque.getFirst().value + " ");
        }

        bw.flush();
        bw.close();

    }
}
