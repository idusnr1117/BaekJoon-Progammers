import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size1 = Integer.parseInt(st.nextToken());
        int size2 = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < size1; i++)
        {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < size2; j++)
        {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayList);

        for (int num : arrayList)
            bw.append(String.valueOf(num)).append(" ");

        bw.flush();
        bw.close();

    }
}
