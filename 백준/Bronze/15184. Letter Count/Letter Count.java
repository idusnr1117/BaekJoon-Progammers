import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().toUpperCase().split("");

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strs));

        for (int i = 0; i < 26; i++)
        {
            System.out.printf("%s | %s\n", (char)(i + 'A'), "*".repeat(Collections.frequency(arrayList, String.valueOf((char)(i + 'A')))));
        }

    }
}
