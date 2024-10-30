import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sample = 1;

        while (true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (w == 0 && d == 0)
                break;

            double ratio = (double) d / (w * 810);
            double year = 0;

            if (ratio > 0)
                year = (5730 * Math.log(ratio)) / Math.log(0.5);

            if (year < 10000)
                year = (int) Math.round(year / 100.0) * 100;
            else
                year = (int) Math.round(year / 1000.0) * 1000;


            System.out.printf("Sample #%d\n", sample);
            System.out.printf("The approximate age is %d years.\n", (int)year);
            System.out.println();

            sample++;
        }
    }
}
