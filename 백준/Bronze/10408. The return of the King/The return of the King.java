import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> grade = new ArrayList<>(Arrays.asList(br.readLine().split("")));

        int a = Collections.frequency(grade, "0");

        for (int i = 0; i < a; i++)
        {
            grade.remove("0");
            grade.remove("1");
            grade.add("10");
        }

        double sum = 0;

        for (String s : grade)
        {
            sum += Double.parseDouble(s);
        }

        System.out.println(String.format("%.2f", sum / grade.size()));

    }
}
