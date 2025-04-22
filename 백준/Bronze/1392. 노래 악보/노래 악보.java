import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 1; i <= N; i++)
        {
            int time = Integer.parseInt(br.readLine());
            for(int j = 0; j < time; j++)
                arrayList.add(i);
        }

        for(int i = 0; i < Q; i++)
        {
            int num = Integer.parseInt(br.readLine());
            sb.append(arrayList.get(num)).append("\n");
        }
        System.out.println(sb);

    }
}
