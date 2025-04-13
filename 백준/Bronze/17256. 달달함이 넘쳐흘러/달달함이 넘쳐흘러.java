import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a_x = Integer.parseInt(st.nextToken());
        int a_y = Integer.parseInt(st.nextToken());
        int a_z = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c_x = Integer.parseInt(st.nextToken());
        int c_y = Integer.parseInt(st.nextToken());
        int c_z = Integer.parseInt(st.nextToken());

        System.out.printf("%d %d %d", (c_x - a_z), (c_y / a_y), (c_z - a_x));

    }
}
