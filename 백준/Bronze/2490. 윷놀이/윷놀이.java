import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++)
        {
            int back = (int) Arrays.stream(br.readLine().split(" ")).filter(o -> o.contains("0")).count();

            if (back == 0)
                System.out.println("E");
            else
                System.out.println(Character.toChars(64 + back));
        }

    }
}
