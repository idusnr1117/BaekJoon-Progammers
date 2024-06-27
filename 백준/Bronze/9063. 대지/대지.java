import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> num_x = new ArrayList<>();
        ArrayList<Integer> num_y = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num_x.add(Integer.parseInt(st.nextToken()));
            num_y.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println
        (
                (Collections.max(num_x) - Collections.min(num_x))
                *
                (Collections.max(num_y) - Collections.min(num_y))
        );

    }
}
