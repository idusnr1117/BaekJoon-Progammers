import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> s = new Stack<Integer>();
		
		int num = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < num; i++)
		{
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			str = st.nextToken();
			
			
			switch (str) {
				case "push":
					s.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (s.isEmpty()) System.out.println(-1);
					else System.out.println(s.pop());
					break;	
				case "size":
					System.out.println(s.size());
					break;
				case "empty":
					if (s.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "top":
					if (s.isEmpty()) System.out.println(-1);
					else System.out.println(s.peek());
					break;
			}
			
		}
		
		
	}
}
