import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double A = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());

            double distance = Math.abs(A - B);

            System.out.printf("%.1f%n", distance);
        }

    }
}
