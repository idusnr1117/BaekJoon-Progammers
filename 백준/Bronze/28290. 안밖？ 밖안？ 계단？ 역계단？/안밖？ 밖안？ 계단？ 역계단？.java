import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        if (S.equals("fdsajkl;") || S.equals("jkl;fdsa"))
            System.out.println("in-out");
        else if (S.equals("asdf;lkj") || S.equals(";lkjasdf"))
            System.out.println("out-in");
        else if (S.equals("asdfjkl;"))
            System.out.println("stairs");
        else if (S.equals(";lkjfdsa"))
            System.out.println("reverse");
        else
            System.out.println("molu");

    }
}
