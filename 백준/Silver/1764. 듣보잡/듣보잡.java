import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> cant_listen = new HashSet<>();
        ArrayList<String> cant_see_and_listen = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            cant_listen.add(br.readLine());
        }

        for (int i = 0; i < M; i++)
        {
            String cant_see = br.readLine();
            if (cant_listen.contains(cant_see))
            {
                cant_see_and_listen.add(cant_see);
            }
        }

        bw.append(cant_see_and_listen.size() + "\n");

        Collections.sort(cant_see_and_listen);

        for (int i = 0; i < cant_see_and_listen.size(); i++) {
            bw.append(cant_see_and_listen.get(i)).append("\n");
        }

        bw.flush();
    }
}



