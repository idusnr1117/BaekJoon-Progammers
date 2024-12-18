import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double sum = (Integer.parseInt(st.nextToken()) * 0.15) + (Integer.parseInt(st.nextToken()) * 0.20) + (Integer.parseInt(st.nextToken()) * 0.25);
            boolean found = false;
            for (int j = 60; j <= 100; j++)
                if (j * 0.40 + sum >= 90)
                {
                    System.out.println(j);
                    found = true;
                    break;
                }
            if (!found)
                System.out.println("impossible");
        }

    }
}
