import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int slash = 1;
        int position = 0;

        while (position < X)
        {
            position += slash;
            slash++;
        }

        slash--;
        position -= slash;

        position = X - position;

        if (slash % 2 == 0)
        {
            System.out.println(position + "/" + (slash - position + 1));
        }
        else
        {
            System.out.println((slash - position + 1) + "/" + position);
        }

    }
}
