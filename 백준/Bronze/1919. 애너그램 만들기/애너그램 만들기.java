import java.io.*;

public class Main{
	
    public static void main(String[] agrs) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        
        int[] cnt_alpha1 = new int[26];
        int[] cnt_alpha2 = new int[26];
        int cnt = 0;
        
        for(int i = 0; i < word1.length(); i++) {
        	cnt_alpha1[word1.charAt(i) - 'a']++;
        }
       
        for(int i = 0; i < word2.length(); i++) {
        	cnt_alpha2[word2.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++) {
            int num = cnt_alpha1[i] - cnt_alpha2[i]; 
            if(num != 0) cnt += Math.abs(num);
        }
        
        System.out.println(cnt);
        
    }    
}