/*
 * Problem : Given an array of size n and having all the 
 *           elements as distinct.
 *           
 *           Print the first , second and third maximum from
 *           the array.
 *           
 *           in O(n);
 * 
 * */


package arrays;

import java.util.Scanner;

public class MaxThreeElements {
	
	static void printMaxThree(int arr[]) {
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
				
			}
			else if(arr[i] < first && arr[i] > second ) {
				
				third = second;
				second = arr[i];
				
			}
			else if(arr[i] < second && arr[i] > third) {
				
				third = arr[i];
			}
			        
			
		}
		
		System.out.println(first +" " +second +" "+third);
		
	}

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			arr[i] = kb.nextInt();
			
		}
      
		
		printMaxThree(arr);
		
	}

}
