/*
 *    
 *    Given a binary array A[] of size N. The task is to 
 *    arrange array in increasing order.
 * 
 * 
 *    Example: I/P : 1 0 1 1 1 1 1 0 0 0
 *             O/P : 0 0 0 0 1 1 1 1 1 1
 * 
 * */


package sorting;

import java.util.Scanner;

public class SortBinaryArray {

	static void sortBinaryArray(int arr[]) {

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				arr[counter++] = 0;
			}
		}

		while (counter < arr.length) {

			arr[counter++] = 1;
		}

	}

	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println();

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();

		}

		sortBinaryArray(arr);
		printArray(arr);

	}

}
