import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> cnts = new ArrayList<>();

        int cnt = 1;
        boolean up = true;

        for (int i = 0; i < N - 1; i++)
        {
            if (nums[i] < nums[i + 1] && up)
            {
                cnt++;
            }
            else
            {
                up = false;
            }

            if (nums[i] > nums[i + 1] && !up)
            {
                cnt++;
                cnts.add(cnt);
            }
            else if (!up && nums[i] < nums[i + 1])
            {
                cnts.add(cnt);
                cnt = 2;
                up = true;
            }
            else if (!up)
            {
                cnts.add(cnt);
                cnt = 1;
                up = true;
            }

        }

        if (cnt > 1)
        {
            cnts.add(cnt);
        }

        if (!cnts.isEmpty())
        {
            System.out.println(Collections.max(cnts));
        }
        else
        {
            System.out.println(1);
        }

    }
}
