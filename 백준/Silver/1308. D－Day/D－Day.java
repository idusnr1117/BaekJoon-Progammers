import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tYear = Integer.parseInt(st.nextToken());
        int tMonth = Integer.parseInt(st.nextToken());
        int tDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int DYear = Integer.parseInt(st.nextToken());
        int DMonth = Integer.parseInt(st.nextToken());
        int DDay = Integer.parseInt(st.nextToken());

        LocalDate today = LocalDate.of(tYear, tMonth, tDay);
        LocalDate dDay = LocalDate.of(DYear, DMonth, DDay);

        LocalDate limitDay = today.plusYears(1000);

        if (!dDay.isBefore(limitDay))
        {
            System.out.println("gg");
            return;
        }

        long daysDifference = ChronoUnit.DAYS.between(today, dDay);

        System.out.printf("D-%d\n", daysDifference);
    }
}
