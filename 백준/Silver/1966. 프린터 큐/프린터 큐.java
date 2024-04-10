import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int test_cases = sc.nextInt();

        for (int i = 0; i < test_cases; i++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<Integer> q = new LinkedList<>();

            for (int j = 0; j < N; j++)
            {
                q.offer(sc.nextInt());
            }

            int cnt = 0;
            
            while (!q.isEmpty())
            {
                int front = q.poll();
                boolean isMax = true;

                for (int num : q)
                {
                    if (num > front)
                    {
                        isMax = false;
                        break;
                    }
                }

                if (isMax)
                {
                    cnt++;
                    if (M == 0) break;
                }
                else q.offer(front);

                M = (M + q.size() - 1) % q.size();
            }

            System.out.println(cnt);
        }

    }
}