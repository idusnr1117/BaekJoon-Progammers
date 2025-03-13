import java.util.*;

class Solution
{

    public int[] solution(String[] id_list, String[] report, int k)
    {
        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> reportListMap = new HashMap<>();
        StringTokenizer st;

        for (String s : report)
        {
            st = new StringTokenizer(s);
            String reporter = st.nextToken();
            String defendant = st.nextToken();
            reportListMap.computeIfAbsent(defendant, key -> new HashSet<>()).add(reporter);
        }

        HashMap<String, Integer> mailCount = new HashMap<>();

        for (String defendant : reportListMap.keySet())
            if (reportListMap.get(defendant).size() >= k)
                for (String reporter : reportListMap.get(defendant))
                    mailCount.put(reporter, mailCount.getOrDefault(reporter, 0) + 1);

        for (int i = 0; i < id_list.length; i++)
            answer[i] = mailCount.getOrDefault(id_list[i], 0);

        return answer;
    }

}