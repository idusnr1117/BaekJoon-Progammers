import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            A.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            B.add(Integer.parseInt(st.nextToken()));

        // A - B
        int count = 0;
        for (int n : A)
            if (!B.contains(n)) count++;

        // B - A
        for (int n : B)
            if (!A.contains(n)) count++;

        System.out.println(count);

    }
}
