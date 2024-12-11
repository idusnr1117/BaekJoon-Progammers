import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String first = String.valueOf(str.charAt(0));
        
        System.out.println(str.length() - str.replace(first, "").length());

    }
}
