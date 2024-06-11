import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] KDA = br.readLine().split("/");

        int K = Integer.parseInt(KDA[0]);
        int D = Integer.parseInt(KDA[1]);
        int A = Integer.parseInt(KDA[2]);

        if (K + A < D || D == 0)
        {
            System.out.println("hasu");
        }
        else
        {
            System.out.println("gosu");
        }

    }
}
