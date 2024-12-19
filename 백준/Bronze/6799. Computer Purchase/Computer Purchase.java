import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        if (n == 0) return;

        List<Computer> computers = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            long value = 2 * Long.parseLong(st.nextToken()) + 3 * Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken());
            computers.add(new Computer(name, value));
        }

        computers.sort((c1, c2) ->
        {
            if (c2.value == c1.value) // 값이 같은 경우
                return c1.name.compareTo(c2.name); // 이름 내림차순
            return Long.compare(c2.value, c1.value); // 점수 내림차순
        });

        if (n > 0) System.out.println(computers.get(0).name);
        if (n > 1) System.out.println(computers.get(1).name);

    }

    static class Computer
    {
        String name;
        long value;

        Computer(String name, long value)
        {
            this.name = name;
            this.value = value;
        }
    }

}
