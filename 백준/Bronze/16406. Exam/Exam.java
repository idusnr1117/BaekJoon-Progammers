import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        
        char[] me = br.readLine().toCharArray();
        char[] friend = br.readLine().toCharArray();

        int same = 0;
        int diff = 0;
        int n = me.length;

        for (int i = 0; i < n; i++)
        {
            if (me[i] == friend[i])
                same++;
            else
                diff++;
        }

        int answer = Math.min(same, k) + Math.min(diff, n - k);
        System.out.println(answer);

    }
}
