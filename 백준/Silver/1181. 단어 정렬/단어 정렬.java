import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            String str = br.readLine();
            if (!strings.contains(str))
            {
                strings.add(str);
            }
        }

        Collections.sort(strings);

        strings = strings.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        for (int i = 0; i < strings.size(); i++)
        {
            System.out.println(strings.get(i));
        }


    }
}
