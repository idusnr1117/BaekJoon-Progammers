import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Double.parseDouble(st.nextToken()) / 2;
        int B = Integer.parseInt(st.nextToken());

        System.out.println((int)Math.min(N, A + B));

    }
}
