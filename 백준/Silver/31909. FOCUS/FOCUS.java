import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] arr = new int[8];

        for (int i = 0; i < 8; i++)
        {
            arr[i] = i;
        }

        while (N-- > 0)
        {
            int num = Integer.parseInt(st.nextToken());

            for (int i = 0; i < 7; i++)
            {
                for (int j = i + 1; j < 8; j++)
                {
                    if (num == (1 << i) + (1 << j))
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        break;
                    }
                }
            }
        }

        System.out.println(arr[K]);

    }
}
