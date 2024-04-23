import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> books = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        int cnts[] = new int[n];

        for (int i = 0; i < n; i++) books.add(br.readLine());
        Collections.sort(books);

        for (int i = 0; i < n; i++) cnts[i] = Collections.frequency(books, books.get(i));

        int max = 0;
        int max_index = 0;

        for (int i = 0; i < n; i++)
        {
            if (cnts[i] > max)
            {
                max = cnts[i];
                max_index = i;
            }
        }

        System.out.println(books.get(max_index));
        
    }
}
