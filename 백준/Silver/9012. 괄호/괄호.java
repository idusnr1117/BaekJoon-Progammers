import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		char ch;
		
		for(int i = 0; i < T; i++) {
			String str = bf.readLine();
			Stack<Character> s = new Stack<Character>();
			
			for(int j = 0; j < str.length(); j++)
			{
				ch = str.charAt(j);
				if(ch == '(') {
					s.push(ch);
				}
				else
				{
					if(s.isEmpty())
					{
						s.push(ch);
						break;
					}
					else s.pop();
				}
			}
			if(s.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
		}
    }
}
