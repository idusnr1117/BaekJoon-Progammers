import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> pokemon = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++)
        {
            String str = br.readLine();
            hashMap.put(str, String.valueOf(i + 1));
            pokemon.put(String.valueOf(i + 1), str);
        }

        for (int i = 0; i < M; i++)
        {
            String str = br.readLine();
            if (str.chars().allMatch(Character::isDigit))
            {
                System.out.println(pokemon.get(str));
            }
            else
            {
                System.out.println(hashMap.get(str));
            }
        }

    }
}
