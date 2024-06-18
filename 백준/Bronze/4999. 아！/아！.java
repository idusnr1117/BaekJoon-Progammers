import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String jaeHwan = br.readLine();
        String doctor = br.readLine();

        if (jaeHwan.length() >= doctor.length())
        {
            System.out.println("go");
        }
        else
        {
            System.out.println("no");
        }

    }
}
