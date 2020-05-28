/*
 *   Given an array A of positive integers. 
 *   Count number of smaller elements on right side of each array element.
 *   
 *   
 *   Examples : 
 *    7
      12 1 2 3 0 11 4
      o/p--> 6 1 1 1 0 1 0

      
      
      5
      1 2 3 4 5
 *    o/p--> 0 0 0 0 0
 *    
 * 
 * SOLUTION : 
 *            Bruteforce approach is to initialize 2 pointers and run through
 *            the array and keep the count of the elements greater than
 *            the current element in the resultant array.
 *             
 *            Time Complexity : O(n^2);
 *            Space Complexity : O(n) ;
 * 
 * 
 * */

package arrays;

import java.util.Scanner;

public class CountSmallerRight {

	static int[] countRight(int arr[]) {

		int resArr[] = new int[arr.length];
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[i]) {

					resArr[i]++;
				}

			}
		}

		resArr[n - 1] = 0;

		return resArr;
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

		int result[] = countRight(arr);

		printArray(result);

	}

}
