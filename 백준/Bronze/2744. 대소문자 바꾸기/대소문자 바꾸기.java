import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String word[] = sc.nextLine().split("");
	String result = "";
	
	for (int i = 0; i < word.length; i++) {
		if (word[i].equals(word[i].toUpperCase()))
		{
			result += word[i].toLowerCase();
		}
		else
		{
			result += word[i].toUpperCase();
		}
	}

	System.out.println(result);
	}
}
