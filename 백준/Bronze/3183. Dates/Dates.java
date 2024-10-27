import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int date = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if (date == 0 && month == 0 && year == 0)
                break;

            Calendar calendar = new GregorianCalendar(year, month - 1, date);
            if (calendar.get(Calendar.YEAR) != year || calendar.get(Calendar.MONTH) + 1 != month || calendar.get(Calendar.DATE) != date)
            {
                System.out.println("Invalid");
            }
            else
            {
                System.out.println("Valid");
            }
        }

    }
}
