import java.io.*;
import java.util.*;

public class Main {

    private static class Seaweed {

        int p, m;

        public Seaweed(int p, int m)
        {
            this.p = p;
            this.m = m;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Seaweed> list = new LinkedList<>();

        for (int i = 0; i <= N; i++)
            list.add(new Seaweed(-1, -1));

        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            String function = st.nextToken();
            int isActive = Integer.parseInt(st.nextToken());

            switch (function)
            {
                case "P":
                    list.get(index).p = isActive;
                    break;
                case "M":
                    list.get(index).m = isActive;
                    break;
            }
        }

        int min = 0;
        int max = 0;

        for (int i = 1; i <= N; i++)
        {
            if (list.get(i).p == 1 && list.get(i).m == 0)
                min++;
            if ((list.get(i).p == 1 || list.get(i).p == -1) && (list.get(i).m == -1 || list.get(i).m == 0))
                max++;
        }

        System.out.println(min + " " + max);

    }
}
