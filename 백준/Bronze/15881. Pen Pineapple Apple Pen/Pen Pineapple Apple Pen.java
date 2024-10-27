import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());

        String[] str = ("O" + br.readLine() + "O").split("pPAp");

        System.out.println(str.length - 1);

    }
}
