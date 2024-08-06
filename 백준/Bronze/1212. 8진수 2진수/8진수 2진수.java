import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();

        String[] conversions = {"000", "001", "010", "011", "100", "101", "110", "111", "1000", "1001"};

        if (num.equals("0"))
        {
            System.out.println("0");
            System.exit(0);
        }
        else
        {
            bw.append(conversions[num.charAt(0) - '0'].replaceFirst("^0+", ""));
        }

        for (int i = 1; i < num.length(); i++)
        {
            bw.append(conversions[num.charAt(i) - '0']);
        }

        bw.flush();
        bw.close();

    }
}
