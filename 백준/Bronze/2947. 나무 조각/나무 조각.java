import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[5];
        int[] sort = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++)
            array[i] = Integer.parseInt(st.nextToken());

        while (!Arrays.equals(array, sort))
        {
            for (int i = 0; i < 4; i++)
            {
                if (array[i] > array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    for (int n : array)
                        System.out.print(n + " ");
                    System.out.println();
                }
            }
        }


    }
}
