import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int last = Math.max(str.lastIndexOf("a"), Math.max(str.lastIndexOf("e"), Math.max(str.lastIndexOf("i"), Math.max(str.lastIndexOf("o"), str.lastIndexOf("u"))))) + 1;

        System.out.println(str.substring(0, last) + "ntry");

    }
}
