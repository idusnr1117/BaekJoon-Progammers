import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int day = Integer.parseInt(br.readLine());
        int kor = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int max = 0;

        if (kor % C == 0)
            max = kor / C;
        else
            max = kor / C + 1;

        if (math % D == 0)
            max = Math.max(math / D, max);
        else
            max = Math.max(math / D + 1, max);

        System.out.println(day - max);

    }
}
