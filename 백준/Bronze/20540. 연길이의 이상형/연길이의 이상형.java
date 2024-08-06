import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();
        char[] mbti = {'I', 'N', 'F', 'P'};
        char[] mbti2 = {'E', 'S', 'T', 'J'};

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == mbti2[i])
            {
                bw.append(String.valueOf(mbti[i]));
            }
            else
            {
                bw.append(String.valueOf(mbti2[i]));
            }
        }

        bw.flush();
        bw.close();

    }
}
