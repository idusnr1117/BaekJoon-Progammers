import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 숫자의 개수

        double[] scores = new double[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(br.readLine()); // 숫자 입력 받기
        }

        Arrays.sort(scores); // 배열 정렬

        for (int i = 0; i < 7; i++) {
            System.out.printf("%.3f\n", scores[i]); // 소수점 셋째 자리까지 출력하고 줄 바꿈
        }
    }
}
