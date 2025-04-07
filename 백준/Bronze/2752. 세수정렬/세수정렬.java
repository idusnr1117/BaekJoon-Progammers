import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            arrayList.add(Integer.parseInt(st.nextToken()));

        Collections.sort(arrayList);

        for (int i = 0; i < 3; i++)
            System.out.print(arrayList.get(i) + " ");

    }
}
