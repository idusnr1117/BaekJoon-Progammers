import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++)
        {
            char[] ch = br.readLine().toCharArray();
            Arrays.sort(ch);
            String s = Arrays.toString(ch);
            hashSet.add(s);
        }

        System.out.println(hashSet.size());

    }
}
