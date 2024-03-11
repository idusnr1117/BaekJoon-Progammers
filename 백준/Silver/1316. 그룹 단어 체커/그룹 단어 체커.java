import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int first = N;
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            for (int j = 0; j < word.length() - 1; j++) {
                if (word.charAt(j) == word.charAt(j + 1)) {
                    continue;
                }
                else if (word.substring(j + 1).contains(String.valueOf(word.charAt(j)))) {
                    first -= 1;
                    break;
                }
            }
        }
        System.out.println(first);
    }
}
