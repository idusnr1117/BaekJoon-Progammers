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

        Arrays.sort(nums);

        int result = 0;

        for (int i = N - 1; 0 < i; i--)
        {
            result += nums[i] - nums[i - 1];
        }

        System.out.println(result + (nums[N - 1] - nums[0]));

    }
}
