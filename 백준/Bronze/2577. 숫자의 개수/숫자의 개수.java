import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String[] strs = String.valueOf(A * B * C).split("");

        ArrayList<String> strings = new ArrayList<>(Arrays.asList(strs));

        for (int i = 0; i <= 9; i++)
        {
            System.out.println(Collections.frequency(strings, String.valueOf(i)));
        }


    }
}
