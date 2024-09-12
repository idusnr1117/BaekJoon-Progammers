import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            int N = Integer.parseInt(br.readLine());
            boolean cheating = false;

            StringTokenizer st = new StringTokenizer(br.readLine());

            ArrayList<String> card = new ArrayList<>();
            ArrayList<String> dolphinCard = new ArrayList<>();

            for (int j = 0; j < N; j++)
            {
                card.add(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++)
            {
                dolphinCard.add(st.nextToken());
            }

            for (String str : dolphinCard)
            {
                if (!card.contains(str) || Collections.frequency(card, str) != Collections.frequency(dolphinCard, str))
                {
                    System.out.println("CHEATER");
                    cheating = true;
                    break;
                }
            }

            if (!cheating)
                System.out.println("NOT CHEATER");

        }

    }
}
