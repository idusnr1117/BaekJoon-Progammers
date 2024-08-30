import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            int numClone = num;
            int sum = 0;
            int numerator = 0;
            int denominator = 0;
            int diagonal = 0;
            for (int i = 1; i <= num; i++)
            {
                sum += i;
                if (sum >= num)
                {
                    diagonal = i;
                    num -= sum - i;
                    break;
                }
            }
            if (diagonal % 2 == 0)
            {
                denominator = diagonal;
                while (num != 1)
                {
                    num--;
                    denominator--;
                    numerator++;
                }
                numerator++;
            }
            else
            {
                numerator = diagonal;
                while (num != 1)
                {
                    num--;
                    denominator++;
                    numerator--;
                }
                denominator++;
            }

            System.out.printf("TERM %d IS %d/%d\n", numClone, numerator, denominator);
        }

    }
}
