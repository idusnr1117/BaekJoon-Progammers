import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(br.readLine());
        String roma = "";

        for (int i = 0; i < num / 5; i++)
        {
            roma += "V";
        }

        for (int i = 0; i < num % 5; i++)
        {
            roma += "I";
        }

        System.out.println(roma);

    }
}
