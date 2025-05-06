import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N;

        while ((N = Integer.parseInt(br.readLine())) != 0)
        {
            ArrayList<String> lower = new ArrayList<>();
            ArrayList<String> input = new ArrayList<>();
            for (int i = 0; i < N; i++)
            {
                String str = br.readLine();
                lower.add(str.toLowerCase());
                input.add(str);
            }
            Collections.sort(lower);
            for (String s : input)
            {
                if (s.toLowerCase().equals(lower.get(0)))
                {
                    System.out.println(s);
                    break;
                }
            }
        }

    }
}
