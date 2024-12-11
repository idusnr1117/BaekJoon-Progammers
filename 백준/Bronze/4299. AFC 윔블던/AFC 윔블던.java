import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = Integer.parseInt(st.nextToken());
        int diff = Integer.parseInt(st.nextToken());

        if ((sum + diff) % 2 != 0 || (sum - diff) % 2 != 0 || sum < diff)
        {
            System.out.println(-1);
            return;
        }

        System.out.println((sum + diff) / 2 + " " + (sum - diff) / 2);

    }
}
