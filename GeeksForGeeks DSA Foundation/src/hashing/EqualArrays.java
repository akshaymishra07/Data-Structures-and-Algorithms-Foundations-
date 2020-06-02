/* 
 *   Given two arrays A and B of equal size N, the task is to find 
 *   if given arrays are equal or not. Two arrays are said to be 
 *   equal if both of them contain same set of elements, arrangements 
 *   (or permutation) of elements may be different though.
     
     
     
     Note:If there are repetitions, then counts of repeated 
     elements must also be same for two array to be equal.
 * 
 *   Example : 1 2 5 4 0
               2 4 5 0 1
 *         
 *            o/p -> true
 *            
 *            1 2 5
 *            2 4 15
 *             
 *            o/p -> false
 *            
 *             
 *       
 *   Solution : Hash the elements of the first array and traverse 
 *              the second array. While traversing the second array 
 *              see if all the elements of second array give a hit 
 *              in the hash.          
 *               
 * 
 * 
 * */


package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualArrays {

	static boolean areEqual(long arr1[], long arr2[]) {

		Map<Long, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {

			if (hm.containsKey(arr1[i])) {

				hm.put(arr1[i], hm.get(arr1[i]) + 1);
			} else
				hm.put(arr1[i], 1);

		}

		for (int i = 0; i < arr2.length; i++) {

			if (!hm.containsKey(arr2[i])) {
				return false;
			}

			if (hm.get(arr2[i]) == 0) {

				return false;
			}

			hm.put(arr2[i], hm.get(arr2[i]) - 1);

		}

		return true;

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		long arr1[] = new long[n];
		long arr2[] = new long[n];
		for (int i = 0; i < n; i++) {

			arr1[i] = kb.nextLong();

		}

		for (int i = 0; i < n; i++) {

			arr2[i] = kb.nextLong();

		}

		boolean result = areEqual(arr1, arr2);

		System.out.println(result);

	}

}
