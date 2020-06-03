/*
 *    Given an array of size n , the task is to
 *    write a function which will return the
 *    second Maximum element from the array.
 *    
 *    Note: The array is not sorted and it may 
 *          contain duplicate elements
 *          
 *          Expected time complexity is O(n);
 *          and expected space complexity is
 *          O(1);
 */

package arrays;

import java.util.Scanner;

public class SecondMaximum {
	
	static int secondMax(int arr[]) {
		
		if(arr.length < 2) {
			return -1;
		}
		
		int first  = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] < first && arr[i] > second) {
				second = arr[i];
			}
				
			
			
		}
		
		if(second == Integer.MIN_VALUE) {
			return -1;
		}
		
		return second;
	}

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			arr[i] = kb.nextInt();
			
		}
		
		int result = secondMax(arr);

		System.out.println(result);
	}

}
