package arrays;

import java.util.Scanner;

public class Reverse {

	static void arrReverse(int arr[]) {
		
		int start = 0 ; 
		int end = arr.length-1;
		
		while(start < end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end --;
		}
		
	}
	
	static void printArray(int arr[]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println("ORIGINAL ARRAY");
		 printArray(arr);
		System.out.println("\nREVERSED ARRAY");
	    arrReverse(arr);
	    printArray(arr);

	}

}
