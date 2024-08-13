import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            strings.add(br.readLine());
        }

        Collections.sort(strings, new Comparator<>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                int num1 = leadNumber(s1);
                int num2 = leadNumber(s2);
                return Integer.compare(num1, num2);
            }

            private int leadNumber(String s)
            {
                String number = s.split(" ")[0];
                return Integer.parseInt(number);
            }
        });

        for (String str : strings)
        {
            System.out.println(str);
        }

    }
}
