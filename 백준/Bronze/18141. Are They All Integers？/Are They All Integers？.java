import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pcs = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] nums = new double[pcs];

        for (int i = 0; i < pcs; i++)
            nums[i] = Double.parseDouble(st.nextToken());

        for (int i = 0; i < pcs; i++)
        {
            for (int j = 0; j < pcs; j++)
            {
                for (int k = 0; k < pcs; k++)
                {
                    if (i != j && i != k && j != k)
                    {
                        if ((nums[i] - nums[j]) % nums[k] != 0)
                        {
                            System.out.println("no");
                            System.exit(0);
                        }
                    }
                }
            }
        }

        System.out.println("yes");

    }
}
