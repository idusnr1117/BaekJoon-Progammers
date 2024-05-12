import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        String str = "";

        for (int i = 0; i < A; i += 4)
        {
            str += "long ";
        }

        System.out.println(str + "int");

    }
}
