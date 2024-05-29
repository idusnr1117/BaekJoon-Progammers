import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int row = 3;

        for (int i = 1; i < N; i++)
        {
            row = row + row - 1;
        }

        System.out.println(row * row);

    }
}
