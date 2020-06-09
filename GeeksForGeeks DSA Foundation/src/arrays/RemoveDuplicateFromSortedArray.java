/*
 *    Given a sorted array, the task is to remove the 
 *    duplicate elements from the array.
 *    
 *  ip-  1 1 2 2 2 6 6 6 6 8 9
 *  op-  1 2 6 8 9
 * 
 *  Brutforce Approach: 
 *  
 *  Take another array and store only distinct elements
 *  in the new array.
 *  
 *  Time : O(n)
 *  Space : O(n)
 *  
 *  
 *  Optimal Approach : 
 *  
 *  Maintain a separate pointer in the same array and store
 *  only first occurrance of a number and skip subsequent
 *  occurences.
 *  
 *  Time: O(n)
 *  Space : O(1)
 * 
 * */




package arrays;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
	
	static int removeDuplicates(int arr[]) {
		
		int j = 0 ;
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			
			if(arr[i+1] != arr[i]){
				
				arr[j] = arr[i];
				j++;
				
			}
		}
		
		arr[j++] = arr[arr.length-1]; 
		
		
		return j ;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();

		}
		
		int j = removeDuplicates(arr);
		
		for(int i = 0 ; i < j ; i++){
			
			System.out.print(arr[i]+" ");
			
		}

	}

}
