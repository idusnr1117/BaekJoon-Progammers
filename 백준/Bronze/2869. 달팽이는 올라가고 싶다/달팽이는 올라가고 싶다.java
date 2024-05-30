import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 거리
        double B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 거리
        double V = Integer.parseInt(st.nextToken()); // 정상의 높이

        int answer = (int) (Math.ceil((V - A) / (A - B)) + 1);
        // 정상의 높이 - 낮에 올라가는 거리(마지막 전날 까지 도달해야하는 높이) / 순수하게 올라가는 거리를 나눈다
        // 소수점으로 나올 수도 있기에 전체 일수를 구하기 위해서 올림을 해준다.
        // 마지막 일 낮에 A 미터를 올라가서 도달하기에 1을 더해준다.

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        
    }
}
