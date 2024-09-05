import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double b = Double.parseDouble(st.nextToken());
            double p = Double.parseDouble(st.nextToken());

            System.out.printf("%.4f %.4f %.4f\n", 60 * (b - 1) / p, 60 * b / p, 60 * (b + 1) / p);
        }

    }
}
