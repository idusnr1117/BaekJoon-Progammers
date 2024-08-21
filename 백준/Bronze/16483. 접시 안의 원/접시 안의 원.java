import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double T = Double.parseDouble(br.readLine());

        System.out.println(Math.round(Math.pow(T / 2, 2)));

    }
}
