/*
 *  Given an array of positive integers , a lucky number is a 
 *  number which has a frequency in the array equal to its
 *  value.
 *  
 *  Our task is to return the lucky number in the array
 *  and if there are multiple lucky numbers then return
 *  the largest of them. If there is no lucky integer then
 *  return -1.
 *  
 *  
 *  SOLUTION:
 *   
 *   A simple hashmap to keep the frequency count of numbers
 *   present in the array and iterating over the hashmap and
 *   return the element having key and value equal.
 *   
 *   Time : O(n)
 *   Space: O(n) 
 * 
 * */

package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LuckyNumber {

	static int findLucky(int arr[]) {

		Map<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {

				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else
				hm.put(arr[i], 1);

		}

		int max = Integer.MIN_VALUE;

		for (Map.Entry entry : hm.entrySet()) {

			if ((int) entry.getValue() == (int) entry.getKey()) {

				if ((int) entry.getKey() > max) {
                    max = (int)entry.getKey();     
				}
			}

		}

		if(max == Integer.MIN_VALUE)
		 return -1;
		else
		  return max;	

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		int result = findLucky(arr);
		System.out.println(result);
	}

}
