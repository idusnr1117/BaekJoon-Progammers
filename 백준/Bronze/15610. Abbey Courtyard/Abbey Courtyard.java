import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        float num = Float.parseFloat(br.readLine());

        System.out.println(Math.sqrt(num) * 4);

    }
}
