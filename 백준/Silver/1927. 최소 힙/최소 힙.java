import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++)
        {
            int x = Integer.parseInt(br.readLine());
            if (x == 0)
            {
                if (minHeap.isEmpty())
                {
                    bw.append("0");
                }
                else
                {
                    bw.append(String.valueOf(minHeap.poll()));
                }
                bw.newLine();
            }
            else
            {
                minHeap.add(x);
            }
        }

        bw.flush();
        bw.close();

    }
}
