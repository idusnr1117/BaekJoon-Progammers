import java.util.HashMap;
import java.util.Stack;

class Solution
{
    static int solution(String s)
    {

        int n = s.length();
        s += s;
        int answer = 0;

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        A:for(int i = 0; i < n; i++)
        {
            Stack<Character> stack = new Stack<>();
            for (int j = i; j < i + n ; j++)
            {
                char c = s.charAt(j);
                if (!hashMap.containsKey(c))
                    stack.push(c);
                else
                {
                    if (stack.isEmpty() || !stack.pop().equals(hashMap.get(c)))
                        continue A;
                }
            }

            if (stack.isEmpty())
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("}]()[{"));

    }
}