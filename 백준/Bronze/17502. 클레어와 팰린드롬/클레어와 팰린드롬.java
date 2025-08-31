import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[] ch = br.readLine().toCharArray();

        int j = N - 1;
        for (int i = 0; i < N / 2; i++)
        {
            if (ch[i] == '?' && ch[j] == '?')
            {
                ch[i] = 'a';
                ch[j] = 'a';
            }
            else if (ch[i] == '?' && ch[j] != '?')
                ch[i] = ch[j];
            else
                ch[j] = ch[i];
            j--;
        }

        if (N % 2 != 0 && ch[N / 2] == '?')
            ch[N / 2] = 'a';

        for (char c : ch)
            System.out.print(c);

    }
}
