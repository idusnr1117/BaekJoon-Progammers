import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while (!(str = br.readLine()).equals("0 0 0 0"))
        {
            String[] dice = str.split(" ");
            int s0 = Integer.parseInt(dice[0]);
            int s1 = Integer.parseInt(dice[1]);
            int r0 = Integer.parseInt(dice[2]);
            int r1 = Integer.parseInt(dice[3]);

            int s0s1 = s0 + s1;
            int r0r1 = r0 + r1;

            if (s0s1 == 3 || r0r1 == 3)
            {
                if (s0s1 == r0r1)
                    System.out.println("Tie.");
                else if (s0s1 == 3)
                    System.out.println("Player 1 wins.");
                else
                    System.out.println("Player 2 wins.");
            }
            else if (s0 == s1 || r0 == r1)
            {
                if (s0 == s1 && r0 == r1)
                {
                    if (s0 == r1)
                    {
                        System.out.println("Tie.");
                    }
                    else if (s0 > r0)
                        System.out.println("Player 1 wins.");
                    else
                        System.out.println("Player 2 wins.");
                }
                else if (s0 == s1)
                    System.out.println("Player 1 wins.");
                else
                    System.out.println("Player 2 wins.");
            }
            else
            {
                String maxS = String.valueOf(Math.max(s0, s1));
                String minS = String.valueOf(Math.min(s0, s1));
                String maxR = String.valueOf(Math.max(r0, r1));
                String minR = String.valueOf(Math.min(r0, r1));

                int S = Integer.parseInt(maxS + minS);
                int R = Integer.parseInt(maxR + minR);

                if (S == R)
                    System.out.println("Tie.");
                else if (S > R)
                    System.out.println("Player 1 wins.");
                else
                    System.out.println("Player 2 wins.");
            }
        }

    }
}
