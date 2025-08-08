import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++)
            arrayList.add(Integer.parseInt(br.readLine()));

        Collections.sort(arrayList);

        for (int i = 0; i < N; i++)
            System.out.println(arrayList.get(i));
        
    }
}
