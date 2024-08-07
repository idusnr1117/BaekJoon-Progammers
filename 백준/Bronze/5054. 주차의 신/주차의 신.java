import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++)
        {
            int shop = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[shop];
            for (int j = 0; j < nums.length; j++)
            {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(nums);
            int result = nums[0];
            for (int j = 1; j < nums.length; j++)
            {
                result += nums[j] - nums[j - 1];
            }
            System.out.println(result + (nums[nums.length - 1] - nums[0]) - nums[0]);
        }


    }
}
