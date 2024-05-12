import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        compare(A, B, C);

    }
    public static void compare(int A, int B, int C)
    {
        if (A == B && A == C)
        {
            System.out.println(10000 + A * 1000);
            return;
        }
        if (A == B || A == C)
        {
            System.out.println(1000 + A * 100);
            return;
        }
        if (B == C)
        {
            System.out.println(1000 + B * 100);
            return;
        }
        System.out.println(Math.max(A, Math.max(B, C)) * 100);
    }

}
