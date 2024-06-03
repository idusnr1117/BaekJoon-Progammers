import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> hash_set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            hash_set.add(Integer.parseInt(st.nextToken()));
        }
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            if (hash_set.contains(Integer.parseInt(st.nextToken())))
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }


    }
}
