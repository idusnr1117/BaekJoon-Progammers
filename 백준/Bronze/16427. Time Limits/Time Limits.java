import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        ArrayList<Double> m = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            m.add(Math.ceil((double) (Integer.parseInt(st.nextToken()) * s) / 1000));
        }

        System.out.println(Collections.max(m).intValue());

    }
}
