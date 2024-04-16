import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(nums);

        int cnt = 0;
        int left = 0;
        int right = n - 1;

        while (left < right)
        {
            int sum = nums[left] + nums[right];
            if (sum == x)
            {
                cnt++;
                left++;
                right--;
            }
            else if (sum < x) left++;
            else right--;

        }

        System.out.println(cnt);
    }
}
