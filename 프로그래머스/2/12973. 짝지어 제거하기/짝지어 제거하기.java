import java.util.HashMap;
import java.util.Stack;

class Solution
{
    static int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
        {
            if (stack.isEmpty() || stack.peek() != c)
                stack.push(c);
            else
                stack.pop();
        }

        return stack.isEmpty() ? 1 : 0;
    }
}