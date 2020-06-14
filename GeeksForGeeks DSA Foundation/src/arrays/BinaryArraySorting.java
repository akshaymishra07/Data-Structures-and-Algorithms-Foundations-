package arrays;

import java.util.Scanner;

public class BinaryArraySorting {

	static void sortBinary(int arr[]) {

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
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();

		}

		sortBinary(arr);
		printArray(arr);
		

	}

}
