/*
 * 
 *    Problem: Given an array of integers , print whether 
 *             the array is sorted or unsorted.
 * 
 * */


package sorting;

import java.util.Scanner;

public class CheckIfSorted {
	
	 static String isSorted(int arr[]){
	        
	        for(int i = 0 ; i < arr.length-1 ; i++){
	            
	            if(arr[i] > arr[i+1] ){
	                return "unsorted";
	            }
	            
	            
	        }
	        
	        
	        return "sorted";
	        
	    }

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();

		}

		System.out.println(isSorted(arr));

	}

}
