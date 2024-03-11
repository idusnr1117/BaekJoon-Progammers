import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력으로부터 정수 N을 받습니다.
        int N = scanner.nextInt();
        // 변수 first를 N으로 초기화합니다.
        int first = N;
        // 개행 문자를 처리합니다.
        scanner.nextLine();

        // N번 반복하는 루프입니다.
        for (int i = 0; i < N; i++) {
            // 한 줄을 입력으로 받아 word 변수에 저장합니다.
            String word = scanner.nextLine();
            // word의 각 문자에 대해 반복하는 루프입니다.
            for (int j = 0; j < word.length() - 1; j++) {
                // 현재 문자와 그 다음 문자가 같은 경우는 넘어갑니다.
                if (word.charAt(j) == word.charAt(j + 1)) {
                    continue;
                }
                // 현재 문자 뒤에 같은 문자가 있는지 확인하고, 있다면 first를 감소시키고 루프를 종료합니다.
                else if (word.substring(j + 1).contains(String.valueOf(word.charAt(j)))) {
                    first -= 1;
                    break;
                }
            }
        }
        // 결과를 출력합니다.
        System.out.println(first);
    }
}