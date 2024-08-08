import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        if (num == 0)
        {
            System.out.println(1);
            System.exit(0);
        }

        for (int i = num - 1; 0 < i; i--)
        {
            num *= i;
        }

        System.out.println(num);

    }
}
