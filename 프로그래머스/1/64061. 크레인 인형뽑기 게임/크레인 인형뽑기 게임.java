import java.io.*;
import java.util.*;

class Solution
{
    public int solution(int[][] board, int[] moves)
    {
        int len = board[0].length;
        int answer = 0;

        Stack<Integer> stack =  new Stack<>();
        stack.push(0);

        for (int i = 0; i < moves.length; i++)
        {
            for (int j = 0; j < len; j++)
            {
                int doll = board[j][moves[i] - 1];
                if (doll != 0)
                {
                    board[j][moves[i] - 1] = 0;
                    if (stack.peek().equals(doll))
                    {
                        stack.pop();
                        answer += 2;
                    }
                    else
                    {
                        stack.push(doll);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}