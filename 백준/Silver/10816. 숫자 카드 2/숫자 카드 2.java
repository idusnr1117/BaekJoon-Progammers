import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++)
        {
            int query = Integer.parseInt(st.nextToken());
            result.append(frequencyMap.getOrDefault(query, 0)).append(" ");
        }

        bw.write(result.toString().trim());
        bw.flush();
        bw.close();
    }
}
