import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str = br.readLine()) != null)
        {
            StringTokenizer st = new StringTokenizer(str);

            int N = Integer.parseInt(st.nextToken()) + 1;
            int S = Integer.parseInt(st.nextToken());

            System.out.println(S / N);
        }

    }
}
