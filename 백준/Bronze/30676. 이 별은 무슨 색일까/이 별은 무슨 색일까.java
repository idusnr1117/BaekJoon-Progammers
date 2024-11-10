import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wave = Integer.parseInt(br.readLine());

        if (wave >= 620)
            System.out.println("Red");
        else if (wave >= 590)
            System.out.println("Orange");
        else if (wave >= 570)
            System.out.println("Yellow");
        else if (wave >= 495)
            System.out.println("Green");
        else if (wave >= 450)
            System.out.println("Blue");
        else if (wave >= 425)
            System.out.println("Indigo");
        else
            System.out.println("Violet");

    }
}
