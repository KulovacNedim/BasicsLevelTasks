package Exercise5;

import java.util.Scanner;

public class SentinelWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = false;
		String word = "";
		String sentence = "";
		
		while (!stop) {
			System.out.print("Enter the word: ");
			word = scanner.next();
			
			if (word.equals("end")) {
				stop = true;
			} else {
				sentence = sentence + word + " ";
			}
		}
		
		scanner.close();
		
		System.out.println("Words you entered are: " + sentence);

	}

}
