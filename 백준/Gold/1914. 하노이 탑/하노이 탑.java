import java.io.*;
import java.math.BigInteger;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int plate = Integer.parseInt(br.readLine());

        bw.append(String.valueOf(minMove(plate)));
        bw.newLine();

        if (plate <= 20)
            hanoi(1, 2, 3, plate);

        bw.flush();
        bw.close();
    }

    // 최소 이동 횟수를 계산하는 메소드
    static BigInteger minMove(int plate)
    {
        return new BigInteger("2").pow(plate).subtract(BigInteger.ONE); // 2^n - 1을 계산
    }

    public static void hanoi(int from, int m, int to, int plate) throws IOException
    {
        if (plate == 1)
        {
            bw.append(from + " " + to);
            bw.newLine();
            return;
        }

        hanoi(from, to, m, plate - 1);
        bw.append(from + " " + to);
        bw.newLine();
        hanoi(m, from, to, plate - 1);
    }

}
