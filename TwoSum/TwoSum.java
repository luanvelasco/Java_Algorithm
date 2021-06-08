package codes;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//-----------------------Creating an array-----------------------
		System.out.print("How many values the nums will have? ");
		int arrayLength = scan.nextInt();
		
		int[] nums = new int[arrayLength];
		
		for(int c = 0; c < arrayLength; c++) {
			System.out.print("Enter the value for position " + c + ": ");
			nums[c] = scan.nextInt();
		}
		System.out.println("The nums is: " + Arrays.toString(nums));
		//-----------------------Creating an array-----------------------
		
		System.out.print("Enter the target value: ");
		int target = scan.nextInt();
		
		int[] output = new int[2];
		
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			sum = nums[i] + nums[i + 1];
			if (sum == target) {
				output[0] = i;
				output[1] = i + 1;
			}
		}
		
		System.out.println("The index of the values add up are: " + Arrays.toString(output));
		
		scan.close();
	}

}
