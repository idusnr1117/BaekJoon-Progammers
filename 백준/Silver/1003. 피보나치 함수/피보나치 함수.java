import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int MAX = 40;
        int[] zero = new int[MAX + 1];
        int[] one = new int[MAX + 1];

        zero[0] = 1;
        one[0] = 0;
        zero[1] = 0;
        one[1] = 1;

        for (int i = 2; i <= MAX; i++)
        {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        for (int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(br.readLine());
            bw.append(String.valueOf(zero[num])).append(" ").append(String.valueOf(one[num])).append("\n");
        }

        bw.flush();
        bw.close();

    }
}
