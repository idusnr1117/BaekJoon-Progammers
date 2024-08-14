import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < K; i++)
        {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        long left = 1;
        long right = Collections.max(arrayList);
        long maxCm = 0;

        while (left <= right)
        {
            long mid = (left + right) / 2;
            long num = 0;

            for (int a : arrayList)
            {
                num += a / mid;
            }

            if (num >= N)
            {
                maxCm = mid;
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        System.out.println(maxCm);

    }
}
