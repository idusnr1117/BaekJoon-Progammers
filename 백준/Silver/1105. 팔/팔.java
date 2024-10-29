import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        if (String.valueOf(L).length() != String.valueOf(R).length())
        {
            System.out.println(0);
            return;
        }

        String left = String.valueOf(L);
        String right = String.valueOf(R);

        int cnt = 0;

        for (int i = 0; i < left.length(); i++)
        {
            if (left.charAt(i) == right.charAt(i))
            {
                if (left.charAt(i) == '8')
                    cnt++;
            }
            else
                break;
        }

        System.out.println(cnt);

    }
}
