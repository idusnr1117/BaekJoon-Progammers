import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> height = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight.add(Integer.parseInt(st.nextToken()));
            height.add(Integer.parseInt(st.nextToken()));
        }

        int[] ranks = new int[N];

        Arrays.fill(ranks, 1);

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (i != j)
                {
                    if (weight.get(i) < weight.get(j) && height.get(i) < height.get(j))
                    {
                        ranks[i]++;
                    }
                }
            }
        }

        for (int rank : ranks)
        {
            System.out.print(rank + " ");
        }

    }
}
