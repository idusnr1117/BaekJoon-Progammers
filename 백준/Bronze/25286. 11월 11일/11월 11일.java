import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Calendar calendar = Calendar.getInstance();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            String[] date = br.readLine().split(" ");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.DATE, 0);
            System.out.printf("%d %d %d\n", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DATE));
        }

    }
}
