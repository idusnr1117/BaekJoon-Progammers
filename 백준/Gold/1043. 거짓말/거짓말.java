import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 총 인원 수
        int M = Integer.parseInt(st.nextToken());  // 총 파티 수

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());  // 진실을 아는 사람 수
        HashSet<Integer> truthSet = new HashSet<>();  // 진실을 아는 사람들을 저장하는 HashSet

        for (int i = 0; i < num; i++)
            truthSet.add(Integer.parseInt(st.nextToken()));

        List<List<Integer>> parties = new ArrayList<>();  // 각 파티별로 참여자 저장
        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int peopleCount = Integer.parseInt(st.nextToken());
            List<Integer> members = new ArrayList<>();

            for (int j = 0; j < peopleCount; j++)
                members.add(Integer.parseInt(st.nextToken()));
            parties.add(members);
        }

        // 모든 파티를 반복하면서 진실을 아는 사람을 전파
        boolean updated;
        do
        {
            updated = false;
            for (List<Integer> party : parties)
            {
                boolean knowsTruth = false;

                // 현재 파티의 참가자가 진실을 아는지 확인
                for (int member : party)
                {
                    if (truthSet.contains(member))
                    {
                        knowsTruth = true;
                        break;
                    }
                }

                // 진실을 아는 사람이 있다면 파티의 모든 참가자를 truthSet에 추가
                if (knowsTruth)
                {
                    for (int member : party)
                    {
                        if (!truthSet.contains(member))
                        {
                            truthSet.add(member);
                            updated = true;  // 새로운 사람이 추가되면 다시 반복 필요
                        }
                    }
                }
            }
        }
        while (updated);

        // 거짓말 가능한 파티 개수 계산
        int lieCount = 0;
        for (List<Integer> party : parties)
        {
            boolean knowsTruth = false;
            for (int member : party) {
                if (truthSet.contains(member))
                {
                    knowsTruth = true;
                    break;
                }
            }
            if (!knowsTruth)
                lieCount++;  // 진실을 아는 사람이 없다면 거짓말 가능
        }

        System.out.println(lieCount);
    }
}
