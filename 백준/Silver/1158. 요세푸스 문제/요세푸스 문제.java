import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        LinkedList<Integer> warrior = new LinkedList<Integer>();
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 1;
        
        String result = "<";
       
        for (int i = 1; i <= N; i++) warrior.offer(i);
        
        while (warrior.size() != 1)
        {
        	if (cnt == K)
        	{
        		result += warrior.poll() + ", ";
        		cnt = 1;
        	}
        	else 
        	{
        		warrior.offer(warrior.poll());
        		cnt++;
        	}
        }
        
        result += warrior.poll();
        
        System.out.println(result + ">");
        
       
    }
}
