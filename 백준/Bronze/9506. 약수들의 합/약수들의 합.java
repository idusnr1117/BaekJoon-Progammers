import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            int num = Integer.parseInt(br.readLine());
            if (num == -1)
            {
                break;
            }
            int sum = 0;
            ArrayList<Integer> nums =  new ArrayList<>();
            for (int i = 1; i < num / 2 + 1; i++)
            {
                if (num % i == 0)
                {
                    nums.add(i);
                }
            }
            for (int a : nums)
            {
                sum += a;
            }
            print(num, sum, nums);
        }
    }

    public static void print(int num, int sum, ArrayList<Integer> nums) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(String.valueOf(num)).append(" = ");
        if (num == sum)
        {
            for (int i = 0; i < nums.size() - 1; i++)
            {
                bw.append(String.valueOf(nums.get(i))).append(" + ");
            }
            bw.append(String.valueOf(nums.get(nums.size() - 1))).append("\n");
            bw.flush();
        }
        else
        {
            System.out.printf("%s is NOT perfect.\n", num);
        }
    }

}
