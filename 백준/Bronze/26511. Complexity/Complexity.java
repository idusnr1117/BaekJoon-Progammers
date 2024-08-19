import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++)
        {
            int result = 0;
            String[] strs = br.readLine().split("");
            List<String> arrayList = Arrays.asList(strs);
            HashSet<String> hashSet = new HashSet<>(Arrays.asList(strs));
            ArrayList<Integer> integers = new ArrayList<>();
            for (String str : hashSet)
            {
                integers.add(Collections.frequency(arrayList, str));
            }
            if (integers.size() < 3)
            {
                System.out.println(0);
            }
            else
            {
                integers.remove(Collections.max(integers));
                integers.remove(Collections.max(integers));
                for (int num : integers)
                {
                    result += num;
                }
                System.out.println(result);
            }
        }

    }
}
