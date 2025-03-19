import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()) / 3 - 2;
        int cnt = 0;

        for (int i = 1; i <= n; i++)
            cnt += i;

        System.out.println(cnt);

    }
}
