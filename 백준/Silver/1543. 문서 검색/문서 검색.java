import java.io.*;

public class Main {
	
    public static void main(String[] agrs) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        
        int len1 = word1.length();
		int len2 = word2.length();
		
		word1 = word1.replace(word2, "");
		
		System.out.println((len1 - word1.length()) / len2);
        
    }    
}