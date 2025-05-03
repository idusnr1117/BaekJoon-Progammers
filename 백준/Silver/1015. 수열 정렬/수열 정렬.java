import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] P = new int[N];
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            A[i] = num;
            arrayList.add(num);
        }

        Collections.sort(arrayList);

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (A[i] == arrayList.get(j))
                {
                    P[i] = j;
                    arrayList.remove(arrayList.get(j));
                    arrayList.add(j, 0);
                    break;
                }
            }
        }

        for (int num : P)
            System.out.print(num + " ");

    }
}
