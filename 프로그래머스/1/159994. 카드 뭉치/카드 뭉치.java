import java.util.*;

class Solution
{

    public String solution(String[] cards1, String[] cards2, String[] goal)
    {
        Queue<String> card1Queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2Queue = new LinkedList<>(Arrays.asList(cards2));
        Queue<String> goalQueue = new LinkedList<>(Arrays.asList(goal));

        while (!goalQueue.isEmpty())
        {
            String peek = goalQueue.peek();
            if (peek.equals(card1Queue.peek()))
            {
                goalQueue.poll();
                card1Queue.poll();
            }
            else if (peek.equals(card2Queue.peek()))
            {
                goalQueue.poll();
                card2Queue.poll();
            }
            else
                break;
        }

        return goalQueue.isEmpty() ? "Yes" : "No";
    }

}