import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int sum = 0;

        ArrayList<Integer> sosus = new ArrayList<>();

        for (int i = N; i <= M; i++)
        {
            if (is_sosu(i))
            {
                sosus.add(i);
                sum += i;
            }
        }

        if (sosus.isEmpty())
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(sum);
            System.out.println(Collections.min(sosus));
        }

    }

    public static boolean is_sosu(int num)
    {
        if (num < 2)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

}
