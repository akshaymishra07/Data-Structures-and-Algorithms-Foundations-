package arrays;
/*
 * By using the approach which includes calling rotateByOne function
 * d times , time complexity of the program is not accepted and TLE 
 * occurs and most of the coding platforms.
 * 
 * So I came up with a logic which is much fast and just involves the
 * concept of reversing the array 
 * 
 *  ---FOR LEFT ROTATE---
 *  reverse(0 , d-1)
 *  reverse(d , arr.length-1)
 *  reverse(0 , arr.length-1)
 *  
 *  
 *  ---FOR RIGHT ROTATE---
 *  
 *   reverse(arr.length - d, arr.length - 1);
	 reverse(0, arr.length - d - 1);
	 reverse(0, arr.length - 1);
 * 
 * 
 * */

import java.util.Scanner;

public class ArrayRotationFast {

	static void reverse(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

	}

	static void leftRotateArray(int arr[], int d) {

		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	static void rightRotateArray(int arr[], int d) {
		reverse(arr, arr.length - d, arr.length - 1);
		reverse(arr, 0, arr.length - d - 1);
		reverse(arr, 0, arr.length - 1);

	}

	static void printArray(int arr[]) {
		//
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int d = kb.nextInt();
		String ch = kb.next();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();
		}

		System.out.println(ch + " rotation");

		if (ch.equals("left")) {

			leftRotateArray(arr, d);
			printArray(arr);

		} else if (ch.equals("right")) {

			
			rightRotateArray(arr, d);
			printArray(arr);
		}

	}

}
