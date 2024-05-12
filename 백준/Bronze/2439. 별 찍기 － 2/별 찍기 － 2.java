import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        for (int i = A; 0 < i; i--)
        {
            String str = "";
            for (int j = A - 1; A - i < j; j--)
            {
                str += " ";
            }
            for (int k = A - i + 1; 0 < k; k--)
            {
                str += "*";
            }
            System.out.println(str);
        }

    }
}
