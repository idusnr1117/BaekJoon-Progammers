import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String nums[] = br.readLine().split(" ");
        int find_num = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (Integer.parseInt(nums[i]) == find_num)
            {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
