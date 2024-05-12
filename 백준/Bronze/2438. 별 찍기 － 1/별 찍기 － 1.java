import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        for (int i = 0; i < A; i++)
        {
            String str = "*";
            for (int j = 0; j < i; j++)
            {
                str += "*";
            }
            System.out.println(str);
        }

    }
}
