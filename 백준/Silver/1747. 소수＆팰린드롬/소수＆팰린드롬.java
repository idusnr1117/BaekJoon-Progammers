import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[10000001];

        for (int i = 2; i < A.length; i++)
            A[i] = i;

        for (int i = 2; i < Math.sqrt(A.length); i++)
        {
            if (A[i] == 0)
                continue;
            for (int j = i + i; j < A.length; j += i)
                A[j] = 0;
        }

        while (true)
        {
            if (A[N] != 0)
            {
                int result = A[N];
                if (isPal(result))
                {
                    System.out.println(result);
                    break;
                }
            }
            N++;
        }

    }

    private static boolean isPal(int result)
    {
        char[] ch = String.valueOf(result).toCharArray();
        int s = 0;
        int e = ch.length - 1;
        while (s < e)
        {
            if (ch[s] != ch[e])
                return false;
            s++;
            e--;
        }
        return true;
    }

}
