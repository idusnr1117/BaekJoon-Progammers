import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= 1000; i++)
            for (int j = 1; j <= i; j++)
                arrayList.add(i);

        int sum = 0;

        for (int i = A - 1; i < B; i++)
            sum += arrayList.get(i);

        System.out.println(sum);

    }
}
