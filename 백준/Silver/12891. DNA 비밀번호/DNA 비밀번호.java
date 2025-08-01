import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    static int[] A;
    static int[] B;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] ch = br.readLine().toCharArray();

        A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        B = new int[]{0, 0, 0, 0};

        for (int i = 0; i < P; i++)
            add(ch[i]);

        int answer = 0;

        if (isValid())
            answer++;

        for (int i = P; i < S; i++)
        {
            add(ch[i]);
            remove(ch[i - P]);

            if (isValid())
                answer++;
        }

        System.out.println(answer);

    }

    static void add(char c)
    {
        if (c == 'A')
            B[0]++;
        else if (c == 'C')
            B[1]++;
        else if (c == 'G')
            B[2]++;
        else if (c == 'T')
            B[3]++;
    }

    static void remove(char c)
    {
        if (c == 'A')
            B[0]--;
        else if (c == 'C')
            B[1]--;
        else if (c == 'G')
            B[2]--;
        else if (c == 'T')
            B[3]--;
    }

    static boolean isValid()
    {
        return IntStream.range(0, 4).allMatch(i -> B[i] >= A[i]);
    }

}
