import java.util.*;

class Solution
{

    public String[] solution(String[] record) {

        ArrayList<String> arrayList = new ArrayList<>();

        StringTokenizer st;
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> message = new HashMap<>();
        message.put("Enter", "님이 들어왔습니다.");
        message.put("Leave", "님이 나갔습니다.");

        for (String s : record)
        {
            st = new StringTokenizer(s);
            String command = st.nextToken();
            if (!command.equals("Leave"))
                hashMap.put(st.nextToken(), st.nextToken());
        }

        for (String s : record)
        {
            st = new StringTokenizer(s);
            String command = st.nextToken();
            if (message.containsKey(command))
                arrayList.add(hashMap.get(st.nextToken()) + message.get(command));

        }

        return arrayList.toArray(new String[0]);
    }

}