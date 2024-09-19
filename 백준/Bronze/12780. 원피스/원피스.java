import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String H = br.readLine() + "#";
        String N = br.readLine();

        String[] strings = H.split(N);

        if (H.length() == 1)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(strings.length - 1);
        }

    }
}
