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
            strings.add(br.readLine());
        }

        Collections.sort(strings);

        strings = strings.stream().distinct().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        for (int i = 0; i < strings.size(); i++)
        {
            System.out.println(strings.get(i));
        }


    }
}
