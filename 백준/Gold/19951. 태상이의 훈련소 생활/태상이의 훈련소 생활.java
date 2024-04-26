import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int place[] = new int[N];

        for (int i = 0; i < N; i++)
        {
            place[i] = Integer.parseInt(st2.nextToken());
        }


        for (int i = 0; i < M; i++)
        {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st3.nextToken());
            int b = Integer.parseInt(st3.nextToken());
            int k = Integer.parseInt(st3.nextToken());
            for (int j = a - 1; j < b; j++)
            {
                place[j] += k;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int a : place)
        {
            sb.append(a).append(" ");
        }

        System.out.println(sb);

    }
}
