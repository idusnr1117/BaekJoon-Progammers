import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] ch = br.readLine().toCharArray();

        for (int i = 0; i < N - 1; i++)
        {
            char[] a = br.readLine().toCharArray();
            for (int j = 0; j < ch.length; j++)
            {
                if (ch[j] != a[j])
                    ch[j] = '?';
            }
        }

        for (char c : ch)
            System.out.print(c);

    }
}
