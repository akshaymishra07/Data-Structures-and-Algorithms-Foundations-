package arrays;

import java.util.Scanner;

/* PrefixSumArray[i] contains the sum of elements from
 * originalArray[0] to originalArray[i];
 * 
 * 
 * PrefixSumArray can be used in finding the SUM in a Range[i,j] 
 * within an array;
 * 
 * 
 * if(i==0){
 *   rangeSum  = prefixSumArray[j];
 * }
 * else
 *    rangeSum = prefixSumArray[j] - prefixSumArray[i-1];
 * 
 * 
 * 
 * */

/*Problem : 
 *   We are given an Array of n integers, We are given q queries
 *   having indices l and r . We have to find out sum between 
 *   the given range of indices.

	Input 
	[4, 5, 3, 2, 5]
	3
	0 3
	2 4
	1 3
	Output
	14 (4+5+3+2)
	10 (3+2+5)
	10 (5+3+2)
 * 
 * */

public class PrefixSumArray {

	static int[] calculatePrefixSumArray(int arr[]) {

		int prefixSumArray[] = new int[arr.length];

		prefixSumArray[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
		}

		return prefixSumArray;
	}

	static int findRangeSum(int arr[], int l, int r) {

		int prefSumArr[] = calculatePrefixSumArray(arr);
		int result = 0;
		if (l == 0) {
			result = prefSumArr[r];
		} else
			result = prefSumArr[r] - prefSumArr[l - 1];

		return result;

	}

	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int n = kb.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elements in the array :");

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();
		}

		System.out.println("Enter the number of QUERIES :");
		int queries = kb.nextInt();

		while (queries-- > 0) {

			System.out.println("Enter l and r separated by a space :");
			int l = kb.nextInt();
			int r = kb.nextInt();

			int result = findRangeSum(arr, l, r);
			System.out.println(result);

		}

		kb.close();

	}

}
