/*
 * 
 *   We have an array of Integers of size n , the task is to 
 *   print the first non repeating character of the array
 *   
 *   Example : 
 *               I/P -->  -1 2 -1 3 2
 *               O/P -->   3   
 *               
 *               return -1 if array doesnt contain any 
 *               non repeating character.
 *   
 *   Solution :
 *    
 *    ----BruteForce Approach----
 *     
 *     we can run a loop for every element in the array and check the num
 *     of times it occurs in the array , when we will find the first element
 *     which is not repeating then we can break the loop and print the
 *     result;
 *     
 *     Time : O(n^2)
 *     
 *     
 *     
 *     ----Optimized Approach----
 *     
 *     We will use a hash map and traverse the whole array and put the 
 *     count of every element in the hashmap. After that we will start 
 *     traversing the hashmap , once we get the count as 1 we will break 
 *     execution and print the current element;
 *  
 * 
 * 
 * */

package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeating {

	 static int firstNonRep(int arr[]) {
		 
		 HashMap<Integer , Integer> hm = new HashMap<>();
		 for (int i = 0; i < arr.length; i++) { 
	            if (hm.containsKey(arr[i])) { 
	                hm.put(arr[i], hm.get(arr[i]) + 1); 
	            } 
	            else { 
	                hm.put(arr[i], 1); 
	            } 
	        } 
	       
		 for(Map.Entry entry : hm.entrySet()) {
			 
			 if((int)entry.getValue() == 1) {
				 
				 return (int)entry.getKey();
			 }
			 
			 
		 }
		 
		 return -1;
	 }
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();

		}
       
	int result = firstNonRep(arr);
	System.out.println(result);	
		
	}

}
