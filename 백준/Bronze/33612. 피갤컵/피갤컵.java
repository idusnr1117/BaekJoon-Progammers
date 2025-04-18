import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int year = 2024;
        int month = 1;

        month += 7 * N;

        year += month / 12;
        month %= 12;

        if (month == 0)
        {
            year--;
            month = 12;
        }

        System.out.printf("%d %d\n", year, month);

    }
}
