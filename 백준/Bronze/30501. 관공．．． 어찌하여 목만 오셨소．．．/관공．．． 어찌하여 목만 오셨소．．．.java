import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<String> names = new ArrayList<>();
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++)
        {
            names.add(br.readLine());
        }

        for (int i = 0; i < cnt; i++)
        {
            if (names.get(i).contains("S"))
            {
                System.out.println(names.get(i));
                break;
            }
        }

    }
}
