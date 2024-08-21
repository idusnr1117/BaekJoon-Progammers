import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Integer> score = new HashMap<>();
        score.put('K', 0);
        score.put('P', 1);
        score.put('N', 3);
        score.put('B', 3);
        score.put('R', 5);
        score.put('Q', 9);

        int black = 0;
        int white = 0;

        for (int i = 0; i < 8; i++)
        {
            String line = br.readLine();
            for (int j = 0; j < 8; j++)
            {
                char piece = line.charAt(j);
                if (piece == '.')
                {
                    continue;
                }
                if (Character.isLowerCase(piece))
                {
                    white += score.get(Character.toUpperCase(piece));
                }
                else
                {
                    black += score.get(piece);
                }
            }
        }

        System.out.println(black - white);

    }
}
