import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0)
        {
            System.out.println(0);
            System.exit(0);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int fifteenPercent = (int) Math.round(N * 0.15);

        List<Integer> subList = list.subList(fifteenPercent, N - fifteenPercent);

        double avg = 0;

        for (int num : subList)
        {
            avg += num;
        }

        double size = subList.size();

        System.out.println(Math.round(avg / size));

    }
}
