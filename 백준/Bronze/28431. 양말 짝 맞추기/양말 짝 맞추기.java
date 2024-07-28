import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            int num = Integer.parseInt(br.readLine());
            if (!nums.contains(num))
            {
                nums.add(num);
            }
            else
            {
                nums.remove(Integer.valueOf(num));
            }
        }

        System.out.println(nums.get(0));

    }
}
