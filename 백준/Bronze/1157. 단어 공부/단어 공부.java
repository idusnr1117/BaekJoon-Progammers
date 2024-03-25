import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine().toUpperCase();
        
        char[] alphabet = new char[26];
        int[] wordCount = new int[26];

        int maxCount = 0;
        int maxIndex = -1;
        
        boolean multipleMax = false;

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (i + 65);
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                wordCount[c - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (wordCount[i] > maxCount) {
                maxCount = wordCount[i];
                maxIndex = i;
                multipleMax = false;
            } else if (wordCount[i] == maxCount) {
                multipleMax = true;
            }
        }

        if (multipleMax) {
            System.out.println("?");
        } else {
            System.out.println(alphabet[maxIndex]);
        }
   }
}
