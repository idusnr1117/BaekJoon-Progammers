import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N;
        int groupIndex = 0;

        while ((N = Integer.parseInt(br.readLine())) != 0)
        {
            groupIndex++;
            String[] names = new String[N];
            String[][] messages = new String[N][N - 1];
            List<String> nasties = new ArrayList<>();
            
            for (int i = 0; i < N; i++)
            {
                st = new StringTokenizer(br.readLine());
                names[i] = st.nextToken();
                for (int j = 0; j < N - 1; j++)
                    messages[i][j] = st.nextToken();
            }

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N - 1; j++)
                {
                    if (messages[i][j].equals("N"))
                    {
                        int senderIndex = (i - j - 1 + N) % N;
                        nasties.add(names[senderIndex] + " was nasty about " + names[i]);
                    }
                }
            }

            System.out.printf("Group %d\n", groupIndex);
            if (nasties.isEmpty())
                System.out.println("Nobody was nasty");
            else
                for (String nasty : nasties)
                    System.out.println(nasty);

            System.out.println();

        }
    }
}
