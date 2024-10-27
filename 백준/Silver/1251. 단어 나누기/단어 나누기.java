import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String str = br.readLine();
       String best = null;

       int len = str.length();

       for (int i = 1; i < len - 1; i++)
       {
           for (int j = i + 1; j < len; j++)
           {
               String start = str.substring(0, i);
               String middle = str.substring(i, j);
               String last = str.substring(j);

               String reversed = new StringBuilder(start).reverse().toString() +
                       new StringBuilder(middle).reverse() +
                       new StringBuilder(last).reverse();

               if (best == null || reversed.compareTo(best) < 0)
                   best = reversed;
           }
       }

       System.out.println(best);

    }
}
