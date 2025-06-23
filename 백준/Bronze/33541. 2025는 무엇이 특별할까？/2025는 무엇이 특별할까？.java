import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int intX = Integer.parseInt(br.readLine());

        int result = 0;

        while (result != intX && intX <= 9999)
        {
            intX++;
            String X = String.valueOf(intX);
            int front = Integer.parseInt(X.substring(0, 2));
            int back = Integer.parseInt(X.substring(2, 4));

            result = front + back;
            result *= result;
        }

        if (intX >= 9999)
            System.out.println(-1);
        else
            System.out.println(result);

    }
}
