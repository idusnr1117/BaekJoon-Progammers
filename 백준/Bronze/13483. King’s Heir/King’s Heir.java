import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = -1;

        int min_year = 0;
        int min_month = 0;
        int min_day = 0;

        int dead_day = Integer.parseInt(st.nextToken());
        int dead_month = Integer.parseInt(st.nextToken());
        int dead_year = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int son = Integer.parseInt(st.nextToken());

        for (int i = 1; i < son + 1; i++)
        {
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            int age = dead_year - year;
            if (dead_month < month || (dead_month == month && dead_day < day))
            {
                age--;
            }

            if (age < 18)
            {
                continue;
            }

            if (min_year == 0 || year > min_year ||
               (year == min_year && month > min_month) ||
               (year == min_year && month == min_month && day > min_day)) {
                min_year = year;
                min_month = month;
                min_day = day;
                index = i;
            }

        }

        System.out.println(index);

    }
}
