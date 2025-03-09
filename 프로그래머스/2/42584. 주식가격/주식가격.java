import java.io.*;
import java.util.*;

class Solution
{
    public static int[] solution(int[] prices)
    {
        int len = prices.length;
        int[] answer = new int[len];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < len; i++)
        {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()])
            {
                int top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);
        }

        while (!stack.isEmpty())
        {
            int top = stack.pop();
            answer[top] = len - 1 - top;
        }

        return answer;

    }
}