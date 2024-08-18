import java.io.*;
import java.util.*;

public class Main {

    public static void main(String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i <= N; i++)
        {
            for (int j = i; j <= N; j++)
            {
                sum += i + j;
            }
        }

//      000111223
//      123123233

        System.out.println(sum);

    }
}