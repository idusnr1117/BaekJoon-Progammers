import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder bf = new StringBuilder();

        int K = Integer.parseInt(br.readLine()) + 1;

        int num = 0;
        while (K != 0)
        {
            num = K % 2;
            bf.append(num);
            K /= 2;
        }

        for (int i = bf.toString().length() - 2; i >= 0; i--)
        {
            if (bf.charAt(i) == '0')
            {
                bw.append("4");
            }
            else
            {
                bw.append("7");
            }
        }

        bw.flush();
    }
}
