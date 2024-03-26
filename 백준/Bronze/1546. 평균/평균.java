import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		String string_scores[] = bf.readLine().split(" ");
		int scores[] = new int[n];
		float max_score = 0;
		float avg = 0;
		
		for (int i = 0; i < n; i++)
		{
			scores[i] = Integer.parseInt(string_scores[i]);
		}
		
		
		for (int i = 0; i < n; i++)
		{
			if(max_score < scores[i])
			{
				max_score = scores[i];
			}
		}
		
		for (int i = 0; i < n; i++)
		{
			scores[i] = Integer.parseInt(string_scores[i]);
		}
		
		for (int i = 0; i < n; i++)
		{
			avg += scores[i] / max_score * 100;
			
		}
		
		System.out.println(avg / n);
		
		
	}

}
