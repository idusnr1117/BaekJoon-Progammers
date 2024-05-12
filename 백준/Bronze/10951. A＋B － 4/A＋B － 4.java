import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null)
        {
            int a = Integer.parseInt(String.valueOf(str.charAt(0)));
            int b = Integer.parseInt(String.valueOf(str.charAt(2)));

            System.out.println(a + b);
        }

    }
}
