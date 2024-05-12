import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        compare(A, B);
    }
    public static void compare(int A, int B)
    {
        if (A > 0 && B > 0)
        {
            System.out.println(1);
            return;
        }
        if (A < 0 && B > 0)
        {
            System.out.println(2);
            return;
        }
        if (A < 0 && B < 0)
        {
            System.out.println(3);
            return;
        }
        System.out.println(4);
    }
    
}
