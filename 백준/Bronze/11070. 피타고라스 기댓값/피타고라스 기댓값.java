import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 팀 개수
            int m = Integer.parseInt(st.nextToken()); // 전체 경기 수
            int[][] teams = new int[n][2];
            int[] value = new int[n];
            for (int j = 0; j < m; j++)
            {
                st = new StringTokenizer(br.readLine());
                int team1 = Integer.parseInt(st.nextToken()) - 1;
                int team2 = Integer.parseInt(st.nextToken()) - 1;
                int team1Score = Integer.parseInt(st.nextToken());
                int team2Score = Integer.parseInt(st.nextToken());
                teams[team1][0] += team1Score; // 득점
                teams[team1][1] += team2Score; // 실점
                teams[team2][0] += team2Score; // 득점
                teams[team2][1] += team1Score; // 실점
            }
            for (int j = 0; j < n; j++)
            {
                if (teams[j][0] == 0 && teams[j][1] == 0)
                    value[j] = 0;
                else
                {
                    double A = teams[j][0] * teams[j][0];
                    double S = teams[j][1] * teams[j][1];
                    value[j] = (int)(A / (A + S) * 1000);
                }
            }
            System.out.println(Arrays.stream(value).max().orElse(0));
            System.out.println(Arrays.stream(value).min().orElse(0));
        }

    }
}
