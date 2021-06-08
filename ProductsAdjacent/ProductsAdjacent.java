package codes;

import java.util.Arrays;
import java.util.Scanner;

public class ProductsAdjacent {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//-----------------------Creating an array-----------------------
		System.out.print("How many values the InputArray will have? ");
		int arrayLength = scan.nextInt();
		
		int[] inputArray = new int[arrayLength];
		
		for(int c = 0; c < arrayLength; c++) {
			System.out.print("Enter the value for position " + c + ": ");
			inputArray[c] = scan.nextInt();
		}
		System.out.println("The inputArray is: " + Arrays.toString(inputArray));
		//-----------------------Creating an array-----------------------
		
		
		int[] sumArray = new int[inputArray.length -1];
		int maxValueLazy = 0;
		int maxValueLambda = 0;
		
		
		for (int i = 0; i < inputArray.length - 1; i++) {
			int sum = inputArray[i] * inputArray[i +1];
			sumArray[i] = sum; 
		}
		
		//lazy method
		Arrays.sort(sumArray);
		maxValueLazy = sumArray[sumArray.length -1];
		System.out.println("The maximum value is: " + maxValueLazy);
		
		//lambda method
		maxValueLambda = Arrays.stream(sumArray).max().getAsInt();
		System.out.println("The maximum value is: " + maxValueLambda);
	
	scan.close();
	}
}
