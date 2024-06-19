import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word1 = br.readLine();
        String word2 = br.readLine();

        int cnt = 0;
        int index = word1.indexOf(word2);

        while (index != -1)
        {
            cnt++;
            index = word1.indexOf(word2, index + word2.length());
        }

        System.out.println(cnt);
        
    }
}
