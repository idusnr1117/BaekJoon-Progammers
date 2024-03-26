import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int n = Integer.parseInt(bf.readLine());
		String nums_list[] = bf.readLine().split("");
		
		for(int i = 0; i < n; i++)
		{
			sum += Integer.parseInt(nums_list[i]);
		}
		
		System.out.println(sum);
		
		
	}
}
