import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int cntZero = 0;

        PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negative = new PriorityQueue<>();

        for (int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(br.readLine());
            if (num == 1)
                sum++;
            else if (num == 0)
                cntZero++;
            else if (num < 0)
                negative.add(num);
            else
                positive.add(num);
        }

        while (positive.size() > 1)
        {
            int a = positive.remove();
            int b = positive.remove();

            sum += a * b;
        }

        if (!positive.isEmpty())
            sum += positive.remove();

        while (negative.size() > 1)
        {
            int a = negative.remove();
            int b = negative.remove();

            sum += a * b;
        }

        if (!negative.isEmpty())
        {
            if (cntZero == 0)
                sum += negative.remove();
        }

        System.out.println(sum);

    }
}
