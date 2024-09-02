import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return - Integer.compare(o1,o2);
            }
        });

        for (int i = 0; i < N; i++)
        {
            int x = Integer.parseInt(br.readLine());
            if (x == 0)
            {
                if (maxHeap.isEmpty())
                {
                    bw.append("0");
                }
                else
                {
                    bw.append(String.valueOf(maxHeap.poll()));
                }
                bw.newLine();
            }
            else
            {
                maxHeap.add(x);
            }
        }

        bw.flush();
        bw.close();

    }
}
