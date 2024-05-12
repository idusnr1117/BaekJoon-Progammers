import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        watch(H, M);
    }
    public static void watch(int H, int M)
    {
        if (M >= 45)
        {
            M -= 45;
            System.out.println(H + " " + M);
            return;
        }
        if (H == 0)
        {
            H = 23;
            M = M - 45;
            M = 60 - Math.abs(M);
            System.out.println(H + " " + M);
            return;
        }
        H = H - 1;
        M = M - 45;
        M = 60 - Math.abs(M);
        System.out.println(H + " " + M);
    }

}
