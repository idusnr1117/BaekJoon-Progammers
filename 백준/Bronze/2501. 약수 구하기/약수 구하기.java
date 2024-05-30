import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int sqrt = (int) Math.sqrt(N);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= sqrt; i++)
        {
            if (N % i == 0)
            {
                arr.add(i);
                if (N / i != i)
                {
                    arr.add(N / i);
                }
            }
        }

        Collections.sort(arr);

        if (K > arr.size())
        {
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(arr.get(K - 1));

    }
}
