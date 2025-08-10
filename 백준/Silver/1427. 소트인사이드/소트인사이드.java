import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);

        for (int i = nums.length - 1; 0 <= i; i--)
            System.out.print(nums[i]);

    }
}
