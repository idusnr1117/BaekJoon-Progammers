import java.util.*;

class Solution
{

    public static String solution(String[] participant, String[] completion)
    {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : completion)
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);

        for (String s : participant)
        {
            if (hashMap.getOrDefault(s, 0) == 0)
                return s;
            hashMap.put(s, hashMap.get(s) - 1);
        }
        return null;
    }

}