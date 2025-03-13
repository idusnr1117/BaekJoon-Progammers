import java.util.*;

class Solution
{

    public int solution(String[] want, int[] number, String[] discount)
    {
        int answer = 0;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < want.length; i++)
            hashMap.put(want[i], number[i]);

        for (int i = 0; i < discount.length - 9; i++)
        {
            HashMap<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j < i + 10; j++)
            {
                if (hashMap.containsKey(discount[j]))
                    discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            if (hashMap.equals(discountMap))
                answer++;
        }

        return answer;
    }

}