import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        System.out.println(N.equals("N") ? "Naver D2" : N.equals("n") ? "Naver D2" : "Naver Whale");

    }
}
