import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean FBICheck = false;

        for (int i = 1; i <= 5; i++) {
            String s = br.readLine().trim();

            if (s.contains("FBI")) {
                System.out.println(i);
                FBICheck = true;
            }
        }

        if (!FBICheck)
            System.out.println("HE GOT AWAY!");
    }
}
