import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] array =
        {
                {0},
                {1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6},
                {5},
                {6},
                {7, 9, 3, 1},
                {8, 4, 2, 6},
                {9, 1}
        };

        for(int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int lastDigit = a % 10;
            int cycleLength = array[lastDigit].length;
            int index = (b % cycleLength) - 1;

            if (index == -1)
                index = cycleLength - 1;

            System.out.println(array[lastDigit][index] == 0 ? 10 : array[lastDigit][index]);
        }

    }
}
