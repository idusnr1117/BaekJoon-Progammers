import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] times = br.readLine().split(":");
        boolean slow = false;
        int minute = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
        int cnt = 0;

        while (cnt != 120)
        {
            if (minute >= 420 && minute < 600)
            {
                minute+=2;
                cnt++;
            }
            else if (minute >= 900 && minute < 60 * 19)
            {
                minute+=2;
                cnt++;
            }
            else
            {
                minute++;
                cnt++;
            }
        }

        System.out.printf("%02d:%02d", minute / 60 % 24, minute % 60);

    }
}