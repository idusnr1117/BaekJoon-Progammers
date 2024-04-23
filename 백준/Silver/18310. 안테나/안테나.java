import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int locations[] = new int[N];

        String strs[] = br.readLine().split(" ");

        for (int i = 0; i < N; i++) locations[i] = Integer.parseInt(strs[i]);

        Arrays.sort(locations);

        if(N % 2 == 0) System.out.println(locations[N / 2 - 1]);
        else System.out.println(locations[N / 2]);

    }
}
