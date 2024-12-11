import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        ArrayList<Integer> arrayList = new ArrayList<>();

        int big = 0;
        int middle = 0;
        int small = 0;

        for (char ch : str.toCharArray())
        {
            int score = 0;
            if (!Character.isDigit(ch))
            {
                if (ch == '(') small++;
                else if (ch == '{') middle++;
                else if (ch == '[') big++;
                else if (ch == ')') small--;
                else if (ch == '}') middle--;
                else if (ch == ']') big--;
            }
            else
            {
                if (small > 0) score += small;
                if (middle > 0) score += 2 * middle;
                if (big > 0) score += 3 * big;
                arrayList.add(score);
            }
        }

        System.out.println(Collections.max(arrayList));

    }
}
