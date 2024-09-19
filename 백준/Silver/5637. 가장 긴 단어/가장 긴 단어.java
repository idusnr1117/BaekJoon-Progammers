import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String maxStr = "";
        int maxLen = 0;
        StringBuilder str = new StringBuilder();


        do
        {
            str.append(br.readLine().replaceAll("[^a-zA-Z\\s-]", "")).append(" ");
        }
        while (!str.toString().contains("E-N-D"));

        StringTokenizer st = new StringTokenizer(str.toString());
        while (st.hasMoreTokens())
        {
            String temp = st.nextToken();
            if (temp.length() > maxLen && !temp.equals("E-N-D"))
            {
                maxLen = temp.length();
                maxStr = temp;
            }
        }

        System.out.println(maxStr.toLowerCase());

    }
}
