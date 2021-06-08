package codeSignal;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Type the string to check: ");
		String origianlString = scan.nextLine();
		
		StringBuilder reversedString = new StringBuilder(origianlString);

		if (reversedString.reverse().toString().equals(origianlString)) {
			System.out.println("Its a palindrome!");
		} else {
			System.out.println("Its not a palindrome!");
		}

		scan.close();
	}

}