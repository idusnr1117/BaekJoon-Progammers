import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            Map<String, Integer> hashMap = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                if (hashMap.containsKey(type))
                {
                    hashMap.put(type, hashMap.get(type) + 1);
                }
                else
                {
                    hashMap.put(type, 1);
                }
            }
            int result = 1;
            for (int cnt : hashMap.values())
                result *= (cnt + 1);

            System.out.println(--result);

        }

    }
}
