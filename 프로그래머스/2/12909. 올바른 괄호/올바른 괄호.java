import java.util.Stack;

class Solution
{
    boolean solution(String s)
    {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
        {
            if (c == '(')
                stack.push(c);
            else if (stack.isEmpty() || stack.pop() == c)
                return false;
        }

        return stack.isEmpty();
    }
}