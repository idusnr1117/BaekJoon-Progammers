import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nums);

        if (nums.get(0) + nums.get(1) <= nums.get(2))
        {
            nums.add(nums.get(0) + nums.get(1) - 1);
        }

        System.out.println(nums.get(nums.size() - 1) + nums.get(0) + nums.get(1));

    }
}
