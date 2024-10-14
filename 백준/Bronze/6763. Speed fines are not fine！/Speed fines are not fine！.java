import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        int gap = speed - limit;

        if (gap >= 31)
            System.out.println("You are speeding and your fine is $500.");
        else if (gap >= 21)
            System.out.println("You are speeding and your fine is $270.");
        else if (gap >= 1)
            System.out.println("You are speeding and your fine is $100.");
        else
            System.out.println("Congratulations, you are within the speed limit!");

    }
}