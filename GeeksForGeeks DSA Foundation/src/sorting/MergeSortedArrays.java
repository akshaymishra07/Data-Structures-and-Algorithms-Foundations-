/*
 *   -----PROBLEM--------
 *   Merge Two Sorted Arrays
 *   
 *   Given two arrays of integers which are already sorted
 *   print their elements in sorted order.
 *   
 *   Example :  a[] = {10 , 15 , 20 , 40};
 *              b[] = {5 , 6 , 6, 10 , 15};
 *              
 *              O/P: 5 6 6 10 10 15 15 20 40 
 *              
 *              
 *   ------------SOLUTION--------------
 *   1.NAIVE APPROACH 
 *    
 *    - Use a resultant array 
 *    - Copy all the elements of the two arrays in the
 *      resultant array.
 *    - Sort the resultant array
 *    - Print all the elements of the resultant array
 *    
 *    Time  : 0((M+N) * log(M+N) )
 *    Space : O(M+N)
 *   
 *   
 *   2. OPTIMIZED APPROACH
 *    
 *    - Take two pointers and point one of them to one of
 *      two arrays respectively.
 *      e.g i: a[] | j : b[]
 *      
 *    - Compare elements at a[i] and b[j] , print the smaller
 *      element and increase the pointer.
 *      
 *    - Once we reach the end of either array a or array b
 *      then print directly print all the elements of the
 *      another array.
 *      
 *      
 *              
 * */

package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

	// Naive Approach
	static void mergeSortedArraysNaive(int arr1[], int arr2[]) {
		int m = arr1.length;
		int n = arr2.length;

		int arr3[] = new int[m + n];

		int k = 0;

		for (int i = 0; i < m; i++) {

			arr3[k++] = arr1[i];
		}
		for (int i = 0; i < n; i++) {

			arr3[k++] = arr2[i];
		}

		Arrays.sort(arr3);

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

	// Optimized Approach
	static void mergeSortedArraysOptimized(int arr1[], int arr2[]) {

		int m = arr1.length;
		int n = arr2.length;

		int i = 0, j = 0;

		while (i < m && j < n) {

			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i++] + " ");
			} else {
				System.out.print(arr2[j++] + " ");
			}

		}

		while (i < m) {

			System.out.print(arr1[i++] + " ");

		}
		while (j < n) {

			System.out.print(arr2[j++] + " ");

		}

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int m = kb.nextInt();
		int n = kb.nextInt();

		int arr1[] = new int[m];
		int arr2[] = new int[n];

		for (int i = 0; i < m; i++) {
			arr1[i] = kb.nextInt();
		}
		for (int j = 0; j < n; j++) {

			arr2[j] = kb.nextInt();
		}

		mergeSortedArraysOptimized(arr1, arr2);
		//mergeSortedArraysNaive(arr1, arr2);

	}

}
