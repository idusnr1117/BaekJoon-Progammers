import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 3; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            nums.add(Integer.parseInt(st.nextToken()));
            nums.add(Integer.parseInt(st.nextToken()));
        }

        int x;
        int y;

        if(nums.get(0).equals(nums.get(2)))
        {
            x = nums.get(4);
        }
        else
        {
            x = (nums.get(0).equals(nums.get(4))) ? (nums.get(2)) : (nums.get(0));
        }

        if(nums.get(1).equals(nums.get(3)))
        {
            y = nums.get(5);
        }
        else
        {
            y = (nums.get(1).equals(nums.get(5))) ? (nums.get(3)) : (nums.get(1));
        }

        System.out.printf("%d %d", x, y);

    }
}
