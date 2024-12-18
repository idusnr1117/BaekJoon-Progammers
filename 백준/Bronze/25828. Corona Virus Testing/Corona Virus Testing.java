import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int group = p * t + g;

        System.out.println(group == g * p ? 0 : group > g * p ? 1 : 2);

    }
}
