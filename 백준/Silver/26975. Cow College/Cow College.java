import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++)
            arrayList.add(Integer.parseInt(st.nextToken()));

        Collections.sort(arrayList);

        long result = 0;

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            int num = iterator.next();
            long tempResult = (long) num * arrayList.size();

            if (tempResult > result)
            {
                result = tempResult;
                N = num;
            }
            iterator.remove();
        }

        System.out.println(result + " " + N);

    }
}
