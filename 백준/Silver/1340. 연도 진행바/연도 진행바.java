import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dateStr = br.readLine().split(" ");
        String[] time = dateStr[3].split(":");

        int year = Integer.parseInt(dateStr[2]);
        boolean check = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            check = true;

        int[] num = {0, 31, check ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int month = 0;
        int days = 0;
        double minute = 0;

        switch (dateStr[0])
        {
            case "January":
                month = 1;
                break;
            case "February":
                month = 2;
                break;
            case "March":
                month = 3;
                break;
            case "April":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "June":
                month = 6;
                break;
            case "July":
                month = 7;
                break;
            case "August":
                month = 8;
                break;
            case "September":
                month = 9;
                break;
            case "October":
                month = 10;
                break;
            case "November":
                month = 11;
                break;
            case "December":
                month = 12;
                break;
        }

        for (int i = 1; i < month; i++)
        {
            days += num[i];
        }

        days += Integer.parseInt(dateStr[1].replace(",", "")) - 1;

        minute = (days * 1440) + (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);


        int totalMinutesInYear = (check ? 366 : 365) * 1440;
        System.out.println(minute / totalMinutesInYear * 100);

    }
}
