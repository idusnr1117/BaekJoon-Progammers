import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++)
        {
            String[] strs = br.readLine().split("");
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < strs.length; j++)
            {
                if (strs[j].equals("O"))
                {
                    cnt++;
                }
                else
                {
                    sum += plus(cnt);
                    cnt = 0;
                }
            }

            if (cnt >= 1)
            {
                sum += plus(cnt);
            }
            System.out.println(sum);
        }

    }

    private static int plus(int cnt)
    {
        int sum = 0;
        for (int i = 1; i <= cnt; i++)
        {
            sum += i;
        }
        return sum;
    }
}
