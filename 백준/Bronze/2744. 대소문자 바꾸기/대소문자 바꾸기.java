import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        StringBuilder result = new StringBuilder();

        for (char ch : chars)
        {
            if (Character.isUpperCase(ch))
            {
                result.append(Character.toLowerCase(ch));
            }
            else
            {
                result.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(result);

    }
}
