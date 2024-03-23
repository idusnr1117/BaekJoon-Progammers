import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		String words[] = word.split("");
		String upper_word[] = word.toUpperCase().split("");
		String lower_word[] = word.toLowerCase().split("");
		String result = "";
		
		for (int i = 0; i < word.length(); i++) {
			if (words[i].equals(upper_word[i]))
			{
				result += lower_word[i];
			}
			else
			{
				result += upper_word[i];
			}
		}

		System.out.println(result);
	}
}
