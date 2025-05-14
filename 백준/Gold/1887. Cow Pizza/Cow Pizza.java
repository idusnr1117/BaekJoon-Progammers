import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] constraints = new int[N];
        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            int Z = Integer.parseInt(st.nextToken());
            int mask = 0;
            for (int j = 0; j < Z; j++)
            {
                int topping = Integer.parseInt(st.nextToken());
                mask |= (1 << (topping - 1));
            }
            constraints[i] = mask;
        }

        int totalCombinations = (1 << T);
        int validCount = 0;

        for (int combo = 0; combo < totalCombinations; combo++)
        {
            boolean isValid = true;

            for (int mask : constraints)
            {
                if ((combo & mask) == mask)
                {
                    isValid = false;
                    break;
                }
            }

            if (isValid)
                validCount++;
        }

        System.out.println(validCount);

    }
}
