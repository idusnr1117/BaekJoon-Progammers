import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        int nums[] = new int[S1 + S2 + S3 + 1];

        for (int i = 1; i <= S1; i++)
        {
            for (int j = 1; j <= S2; j++)
            {
                for (int k = 1; k <= S3; k++)
                {
                    nums[i + j + k]++;
                }
            }
        }

        int max = 0;
        int max_index = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (max < nums[i])
            {
                max = nums[i];
                max_index = i;
            }
        }

        System.out.println(max_index);

    }
}
