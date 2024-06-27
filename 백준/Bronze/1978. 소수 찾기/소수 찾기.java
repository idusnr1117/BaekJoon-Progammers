import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = st.countTokens();
        int cnt = 0;

        for (int i = 0; i < size; i++)
        {
            int sosu_cnt = 0;
            int num = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= num; j++)
            {
                if (num % j == 0)
                {
                    sosu_cnt++;
                }
            }
            if (sosu_cnt == 2)
            {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
