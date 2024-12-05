import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("-");

        int result = sum(str[0]);

        for (int i = 1; i < str.length; i++)
            result -= sum(str[i]);

        System.out.println(result);

    }

    private static int sum(String s)
    {
        String[] nums = s.split("\\+");
        int sum = 0;

        for (String num : nums)
            sum += Integer.parseInt(num);

        return sum;
    }

}
