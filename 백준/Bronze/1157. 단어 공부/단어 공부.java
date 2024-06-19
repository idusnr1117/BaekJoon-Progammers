import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        int[] alphabet_count = new int[26];

        for (char ch : word.toCharArray())
        {
            alphabet_count[ch - 'A']++;
        }

        int max_count = -1;
        char result = '?';

        for (int i = 0; i < 26; i++)
        {
            if (alphabet_count[i] > max_count)
            {
                max_count = alphabet_count[i];
                result = (char) ('A' + i);
            }
            else if (alphabet_count[i] == max_count)
            {
                result = '?';
            }
        }

        System.out.println(result);

    }
}
