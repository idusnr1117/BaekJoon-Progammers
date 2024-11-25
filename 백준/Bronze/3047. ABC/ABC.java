import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String sort = br.readLine();

        int[] abc = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        Arrays.sort(abc);

        for (char ch : sort.toCharArray())
        {
            switch (ch)
            {
                case 'A':
                    System.out.print(abc[0] + " ");
                    break;
                case 'B':
                    System.out.print(abc[1] + " ");
                    break;
                case 'C':
                    System.out.print(abc[2] + " ");
                    break;
            }
        }

    }
}
