package application;

import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter de n-interesting to calcule te area: ");
		int n = scan.nextInt();
			
		int area = (int) (Math.pow(n, 2) + Math.pow(n - 1, 2));
		
		System.out.println("The area of polygon is: " + area);

		scan.close();
	}

}
