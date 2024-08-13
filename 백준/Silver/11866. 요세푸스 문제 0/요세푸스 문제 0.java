import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<String> josephus = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= N; i++)
        {
            josephus.offer(String.valueOf(i));
        }

        while (!josephus.isEmpty())
        {
            for (int i = 0; i < K - 1; i++)
            {
                josephus.offer(josephus.poll());
            }
            arrayList.add(josephus.poll());
        }

        System.out.println(String.valueOf(arrayList).replace("[", "<").replace("]", ">"));

//      1 2 3 4 5 6 7
//      1 2 4 5 6 7
//      1 2 4 5 7
//      1 4 5 7
//      1 4 5
//      1 4
//      4

    }
}
