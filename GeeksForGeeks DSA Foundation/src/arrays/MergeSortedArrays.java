/* We are given two sorted arrays arr1[ ] and arr2[ ] of size m 
 * and n. We have to merge these arrays and store the numbers 
 * in arr3[ ] of size m+n.

	Input
	1 3 4 6
	2 5 7 8
	Output
	1 2 3 4 5 6 7 8

	Solution : Idea is to traverse both arrays simultaneously and 
	compare the current numbers from the both the Arrays. Pick the 
	smaller element and copy to arr3[ ] and advances the current 
	index of the array, from where smaller element is picked. 
	When we reach the end of one of the array, Copy the remaining 
	elements of another array to arr3[].



*/

package arrays;

import java.util.Scanner;

public class MergeSortedArrays {

	static int[] mergeSortedArrays(int arr1[], int arr2[]) {

		int resultArray[] = new int[arr1.length + arr2.length];
		int m = arr1.length;
		int n = arr2.length;
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {

			if (arr1[i] < arr2[j]) {
				//System.out.println("Registering : "+arr1[i]);
				resultArray[k++] = arr1[i++];
				
			}else{
				//System.out.println("Registering : "+arr2[j]);
				resultArray[k++] = arr2[j++];
				
			}

			
		}

		while (i < m) {
			resultArray[k++] = arr1[i++];
			
		}

		while (j < n) {
			resultArray[k++] = arr2[j++];
			
		}

		return resultArray;
	}

	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int size1 = kb.nextInt();
		int size2 = kb.nextInt();

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			arr1[i] = kb.nextInt();

		}

		for (int j = 0; j < size2; j++) {
			arr2[j] = kb.nextInt();

		}

		int result[] = mergeSortedArrays(arr1,arr2);

		printArray(result);

	}

}
