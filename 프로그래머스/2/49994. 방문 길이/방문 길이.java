import java.io.*;
import java.util.HashSet;

class Solution
{
    public static int solution(String dirs)
    {
        HashSet<String> hashSet = new HashSet<>();

        int x = 0;
        int y = 0;

        for (char c : dirs.toCharArray())
        {
            System.out.println(c);
            int start_x = x;
            int start_y = y;
            if (c == 'U' && y <= 4)
                y++;
            else if (c == 'L' && x >= -4)
                x--;
            else if (c == 'R' && x <= 4)
                x++;
            else if (c == 'D' && y >= -4)
                y--;
            if (x != start_x || y != start_y)
            {
                hashSet.add(String.valueOf(x) + y + " " + start_x + start_y);
                hashSet.add(String.valueOf(start_x) + start_y + " " + x + y);
            }
        }

        return hashSet.size() / 2;
    }
}