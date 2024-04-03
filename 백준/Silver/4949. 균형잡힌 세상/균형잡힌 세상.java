import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> s = new Stack<Character>();
		char ch;
		
		while(true)
		{
			String str = br.readLine();
			
			if(str.equals(".")) break;
			
			for(int i = 0; i < str.length(); i++)
			{
				ch = str.charAt(i);
				
				if(ch == '(' || ch == '[') s.push(ch);
				
				if(ch == ')')
				{
					if(s.empty())
					{
						s.push(ch);
						break;
					}
					
					if(s.peek() == '(') s.pop();
					else break;
				}
				else if(ch == ']')
				{
					if(s.empty())
					{
						s.push(ch);
						break;
					}
					
					if(s.peek() == '[') s.pop();
					else break;
				}
			}
			if(s.isEmpty()) System.out.println("yes");
			else System.out.println("no");
			
			s.clear();
		}
    }
    	
}

