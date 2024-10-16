import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int opponentPrice = Integer.parseInt(st.nextToken());
        int opponentPerformance = Integer.parseInt(st.nextToken());
        int WARBOYPrice = Integer.parseInt(st.nextToken());

        double performance = (double)opponentPerformance / opponentPrice;

        System.out.println((int)(performance * 3 * WARBOYPrice));

    }
}