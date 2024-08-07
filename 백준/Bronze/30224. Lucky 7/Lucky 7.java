import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String lucky = br.readLine();
        int luckyNum = Integer.parseInt(lucky);

        if (luckyNum % 7 == 0 && lucky.contains("7"))
        {
            System.out.println(3);
        }
        else if (luckyNum % 7 != 0 && lucky.contains("7"))
        {
            System.out.println(2);
        }
        else if (luckyNum % 7 == 0 && !lucky.contains("7"))
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }

    }
}
