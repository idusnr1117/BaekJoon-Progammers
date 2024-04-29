import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int alphabets[] = new int[26];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++)
            {
                char c = str.charAt(j);
                alphabets[c - 'A'] += (int) Math.pow(10, str.length() - 1 - j);
            }
        }

        Arrays.sort(alphabets);

        int num = 9;
        int ans = 0;
        for (int i = alphabets.length - 1; i >= 0; i--)
        {
            ans += alphabets[i] * num;
            num--;
        }
        System.out.print(ans);

    }
}

