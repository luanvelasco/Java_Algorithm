package codeSignal;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Type the string to check: ");
		String originalString = scan.nextLine();
		
		//Security check for sentences
		if (originalString.indexOf(' ') >=0) {
			originalString = originalString.replaceAll("\\s+","").trim().toLowerCase();
			System.out.println(originalString);
		}
		
		
		StringBuilder reversedString = new StringBuilder(originalString);
		
		if (reversedString.reverse().toString().equals(originalString)) {
			System.out.println("Its a palindrome!");
		} else {
			System.out.println("Its not a palindrome!");
		}

		scan.close();
	}

}