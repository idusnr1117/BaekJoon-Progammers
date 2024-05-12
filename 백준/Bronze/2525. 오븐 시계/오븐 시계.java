import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        H *= 60;
        H += M + C;
        M = H % 60;
        H = H / 60;
        if (H >= 24)
        {
            H -= 24;
        }
        System.out.println(H + " " + M);

    }
}
