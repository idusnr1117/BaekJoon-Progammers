import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] Fibos = new int[46];
        Fibos[1] = 1;
        for (int i = 2; i <= n; i++) {
            Fibos[i] = Fibos[i-1] + Fibos[i-2];
        }

        System.out.println(Fibos[n]);
    }
}
