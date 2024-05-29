import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        int result = 0;
        int power = 1;

        for (int i = N.length() - 1; i >= 0; i--)
        {
            char ch = N.charAt(i);
            int digit = Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10;
            result += digit * power;
            power *= B;
        }

        System.out.println(result);

    }
}
