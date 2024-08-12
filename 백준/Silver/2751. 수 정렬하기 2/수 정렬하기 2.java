import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            integers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(integers);

        for (int a : integers)
        {
            bw.append(String.valueOf(a));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
