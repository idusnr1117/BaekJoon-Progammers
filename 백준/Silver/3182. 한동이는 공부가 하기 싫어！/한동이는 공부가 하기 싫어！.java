import java.io.*;
import java.util.*;

public class Main {

    static int N; // 메서드에서 사용하기 위해서 전역변수로 선언
    static int[] next;  // 각 선배가 가리키는 다음 선배 번호 (1-based index)

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        next = new int[N + 1]; // 인덱스를 1부터 쓰기 위해 N+1 크기

        for (int i = 1; i <= N; i++)
            next[i] = Integer.parseInt(br.readLine());

        int maxCount = 0;
        int answer = 0;

        for (int i = 1; i <= N; i++)
        {
            int count = bfs(i); // 각각 선배별 count를 계산
            if (count > maxCount)
            {
                maxCount = count;
                answer = i;
            }
            else if (count == maxCount && i < answer)
                answer = i; // 동일하면 번호 작은 것
        }

        System.out.println(answer);
    }

    static int bfs(int start)
    {

        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        int count = 1;

        while (!queue.isEmpty())
        {
            int curr = queue.poll();
            int nextPerson = next[curr];

            if (!visited[nextPerson])
            {
                visited[nextPerson] = true;
                queue.add(nextPerson);
                count++;
            }
            else
                break; // 이미 방문했으면 사이클이므로 중단
        }

        return count;
    }

}
