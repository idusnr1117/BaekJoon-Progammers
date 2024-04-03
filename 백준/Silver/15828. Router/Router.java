import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int input = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        while(true)
        {
        	input = sc.nextInt();
        	if (input == 0) q.poll();
        	else if (input == -1) break;
        	else if (q.size() < N) q.offer(input);
        }
        
        System.out.println(("" + q).replace("[", "").replace("]", "").replace(",", ""));
        
       
    }
}
