import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String promises[] =  {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry", "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"};
        ArrayList<String> AL_promises = new ArrayList<>(Arrays.asList(promises));

        int N = Integer.parseInt(br.readLine());
        String promise;

        for (int i = 0; i < N; i++)
        {
            promise = br.readLine();
            if(!AL_promises.contains(promise))
            {
                System.out.println("Yes");
                System.exit(0);
            }
        }

        System.out.println("No");

    }
}
