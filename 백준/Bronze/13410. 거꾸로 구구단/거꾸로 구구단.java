import java.io.*;
import java.util.*;

public class Main {

    public static void main(String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= K; i++)
        {
            String str = String.valueOf(N * i);
            String result = "";
            for (int j = str.length() - 1; 0 <= j; j--)
            {
                result += String.valueOf(str.charAt(j));
            }
            nums.add(Integer.parseInt(result));
        }

        System.out.println(Collections.max(nums));

    }
}