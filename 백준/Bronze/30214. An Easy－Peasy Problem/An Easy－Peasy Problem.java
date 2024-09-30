import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double s1 = Integer.parseInt(st.nextToken());
        double s2 = Integer.parseInt(st.nextToken());

        System.out.println(s1 >= s2 / 2 ? "E" : "H");

    }
}