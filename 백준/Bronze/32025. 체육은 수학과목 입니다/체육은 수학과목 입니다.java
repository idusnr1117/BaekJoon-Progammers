import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine()) * 100;
        int w = Integer.parseInt(br.readLine()) * 100;

        int min = Math.min(h, w);

        System.out.println(min / 2);

    }
}
