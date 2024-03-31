import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());
		int abc = a + b + c;
		List<Integer> nums = Arrays.asList(a, b, c);
		Set<Integer> num_set = new HashSet<>(nums);
		int eqalus_cnt = nums.size() - num_set.size();
		
		if (abc != 180) System.out.println("Error");
		else if (eqalus_cnt == 2) System.out.println("Equilateral");
		else if (eqalus_cnt == 1) System.out.println("Isosceles");
		else System.out.println("Scalene");
		
	}
}
