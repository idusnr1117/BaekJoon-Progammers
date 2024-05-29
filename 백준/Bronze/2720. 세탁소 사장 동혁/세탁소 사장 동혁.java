import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int coins[] = {25, 10, 5, 1};
        int cnts[] = {0, 0, 0, 0};
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            int cent = Integer.parseInt(br.readLine());
            for (int j = 0; j < coins.length; j++)
            {
                cnts[j] += cent / coins[j];
                cent %= coins[j];
            }
            for(int j = 0; j < cnts.length - 1; j++)
            {
                System.out.print(cnts[j] + " ");
            }
            System.out.println(cnts[3]);
            Arrays.fill(cnts, 0);
        }

    }
}
