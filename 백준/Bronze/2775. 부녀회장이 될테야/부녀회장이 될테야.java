import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[] nums = new int[n];

            for (int j = 0; j < n; j++)
            {
                nums[j] = j + 1;
            }

            for (int j = 0; j < k; j++)
            {
                for (int l = 1; l < n; l++)
                {
                    nums[l] += nums[l - 1];
                }
            }

            System.out.println(nums[n - 1]);

        }

    }
}
