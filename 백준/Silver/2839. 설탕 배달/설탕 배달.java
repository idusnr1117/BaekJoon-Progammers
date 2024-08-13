import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int multi;
        int min = 5000;

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= 2000; i++)
        {
            for (int j = 0; j <= 1000; j++)
            {
                multi = 3 * i + 5 * j;
                arrayList.add(multi);

                if(multi == N)
                {
                    if(i + j < min)
                    {
                        min = i + j;
                    }
                }
            }
        }

        if(!arrayList.contains(N))
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(min);
        }


    }
}
