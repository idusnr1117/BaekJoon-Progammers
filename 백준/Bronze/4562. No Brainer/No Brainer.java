import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            if (Integer.parseInt(st.nextToken()) >= Integer.parseInt(st.nextToken()))
                System.out.println("MMM BRAINS");
            else
                System.out.println("NO BRAINS");
        }

    }
}
