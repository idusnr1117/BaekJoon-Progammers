import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int num = Integer.parseInt(bf.readLine());
		int last = 0;
		
		for (int i = 0; i < num; i++)
		{
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			str = st.nextToken();
			
			
			switch (str) {
				case "push":
					last = Integer.parseInt(st.nextToken());
					q.offer(last);
					break;
				case "pop":
					if (q.isEmpty()) System.out.println(-1);
					else System.out.println(q.poll()); 
					break;	
				case "size":
					System.out.println(q.size());
					break;
				case "empty":
					if (q.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "front":
					if (q.isEmpty()) System.out.println(-1);
					else System.out.println(q.peek());
					break;
				case "back":
					if (q.isEmpty()) System.out.println(-1);
					else System.out.println(last);
					break;
			}
			
		}
		
		
	}
}
