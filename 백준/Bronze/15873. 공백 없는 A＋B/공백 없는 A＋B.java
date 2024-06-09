import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        int first = Integer.parseInt(String.valueOf(num.charAt(0)));
        int last = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)));

        if (num.length() == 2)
        {
            System.out.println(first + Integer.parseInt(String.valueOf(num.charAt(1))));
        }
        else if (last == 0 && num.length() == 3)
        {
            System.out.println(first + 10);
        }
        else if (num.length() == 3)
        {
            System.out.println(10 + last);
        }
        else
        {
            System.out.println(20);
        }

    }
}
