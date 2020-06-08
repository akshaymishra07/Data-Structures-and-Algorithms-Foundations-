/*
 * 
 *   Given an array containing only 0s and 1s
 *   segregate all 0s to the left side and
 *   all the 1s to the right side. 
 *   
 *   
 * 
 * 
 * */


package arrays;

import java.util.Scanner;

public class SeparateZeroOne {

	static void separate(int arr[]) {
		
		int count = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] == 0) {
				arr[count] = 0;
				count++;
			}
		}
		
		while(count < arr.length) {
			arr[count] = 1;
			count++;
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
		
		for(int i = 0 ; i < n ; i++ ){
			arr[i] = kb.nextInt();
			
		}
		
		separate(arr);
		printArray(arr);

	}

}
