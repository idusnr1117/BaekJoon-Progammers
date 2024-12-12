import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] team1 = br.readLine().split(" ");
        String[] team2 = br.readLine().split(" ");
        int[] scores = {6, 3, 2, 1, 2};

        int total = 0;

        for (int i = 0; i < 5; i++)
            total += scores[i] * Integer.parseInt(team1[i]);

        System.out.print(total + " ");

        total = 0;

        for (int i = 0; i < 5; i++)
            total += scores[i] * Integer.parseInt(team2[i]);

        System.out.println(total);

    }
}
