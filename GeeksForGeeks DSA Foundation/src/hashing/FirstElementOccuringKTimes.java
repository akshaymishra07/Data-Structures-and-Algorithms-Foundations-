/*
 *    Given an array of N integers. The task is to find the first 
 *    element that occurs K number of times. If no element occurs K 
 *    times the print -1.
 * 
 *    I/P -> 1 7 4 3 4 8 7
 *    O/P -> 7
 *    
 *   
 *   Solution :  Storing all the elements of the array in the 
 *               hashmap with their count and returning the 
 *               first element that has exactly k as the 
 *               count.
 *               
 *               Time Complexity : O(n)
 *               Space Complexity: O(n)
 *               
 *               
 * 
 * 
 * */

package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstElementOccuringKTimes {

	static int findElement(int arr[], int k) {

		HashMap<Integer, Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {

				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else
				hm.put(arr[i], 1);
		}

		for (Map.Entry entry : hm.entrySet()) {

			if ((int) entry.getValue() == k) {

				return (int) entry.getKey();

			}

		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();
		}

		int result = findElement(arr, k);
		
		System.out.println(result);

	}

}
