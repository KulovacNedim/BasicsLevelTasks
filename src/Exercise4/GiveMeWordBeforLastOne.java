package Exercise4;

import java.util.Scanner;

public class GiveMeWordBeforLastOne {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the sentence: ");
		
		String sentence = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("The word before last one is: " + getTheWordBeforeLastOne(sentence));

	}

	private static String getTheWordBeforeLastOne(String sentence) {
		
		String safeWord = "";
		String word = "";
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == " ".charAt(0)) {
				safeWord = word;
				word = "";
			} else {
				word = word + sentence.charAt(i);
			}
		}
		
		return safeWord;
	}

}
