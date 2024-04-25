import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();
        String str_nums[] = String.valueOf(b).split("");

        int nums[] = new int[3];

        for (int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(str_nums[i]);
        
        System.out.println(a * nums[2]);
        System.out.println(a * nums[1]);
        System.out.println(a * nums[0]);
        System.out.println(a * b);

    }
}
