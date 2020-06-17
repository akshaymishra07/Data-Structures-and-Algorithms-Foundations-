/*
 * 
 *    Given an array of integers, and an integer  ‘K’ , find the 
 *    count of pairs of elements in the array whose sum is 
 *    equal to 'K'.
 *     
 *    
 *    Solution : 
 *   
 *    A simple solution is be traverse each element and check 
 *    if there’s another number in the array which can be 
 *    added to it to give sum.
 *    
 *        
 *    Optimized Solution :
 *     
 *    1.Create a map to store frequency of each number in the 
 *    array. (Single traversal is required)
      
      2.In the next traversal, for every element check if 
      it can be combined with any other element (other than 
      itself!) to give the desired sum. Increment the counter 
      accordingly.
      
      3.After completion of second traversal, we’d have twice 
      the required value stored in counter because every pair 
      is counted two times. Hence divide count by 2 and return.
 *   
 *   
 * 
 * */

package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairsWithGivenSum {

	static int getPairsCount(int arr[], int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		// Store counts of all elements in map hm
		for (int i = 0; i < arr.length ; i++) {

			// initializing value to 0, if key not found
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i], 0);

			hm.put(arr[i], hm.get(arr[i]) + 1);
		}
		int twice_count = 0;

		// iterate through each element and increment the
		// count (Notice that every pair is counted twice)
		for (int i = 0; i < arr.length ; i++) {
			if (hm.get(sum - arr[i]) != null)
				twice_count += hm.get(sum - arr[i]);

			// if (arr[i], arr[i]) pair satisfies the condition,
			// then we need to ensure that the count is
			// decreased by one such that the (arr[i], arr[i])
			// pair is not considered
			if (sum - arr[i] == arr[i])
				twice_count--;
		}

		// return the half of twice_count
		return twice_count / 2;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int sum = kb.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();

		}
		
		int result = getPairsCount(arr, sum);
		System.out.println(result);

	}

}
