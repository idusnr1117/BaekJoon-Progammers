import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        compare(score);
    }

    public static void compare(int score)
    {
        if (score >= 90)
        {
            System.out.println("A");
            return;
        }
        if (score >= 80)
        {
            System.out.println("B");
            return;
        }
        if (score >= 70)
        {
            System.out.println("C");
            return;
        }
        if (score >= 60)
        {
            System.out.println("D");
            return;
        }
        System.out.println("F");
    }

}
