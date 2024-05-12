import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total_money = sc.nextInt();
        int sum = 0;
        int A = sc.nextInt();

        for (int i = 0; i < A; i++)
        {
            int money = sc.nextInt();
            int cnt = sc.nextInt();
            sum += money * cnt;
        }

        if (sum == total_money)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
