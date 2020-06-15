package arrays;

import java.util.Scanner;

public class RunningSum {

 static  int[] calculateRunningSum(int[] nums) {

		int sums[] = new int[nums.length];
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			sums[i] = sum;

		}

		return sums;
	}
 
 static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
 

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();

		}

	 int result[] =	calculateRunningSum(arr);
	 printArray(result);
	 
	}

}
