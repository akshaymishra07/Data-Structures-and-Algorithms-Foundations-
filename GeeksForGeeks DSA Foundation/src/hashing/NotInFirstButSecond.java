/*
 *    
 *    Given two arrays, the task is that we find numbers which are 
 *    present in first array, but not present in the second array.
 *    
 *    Input : a[] = {1, 2, 3, 4, 5, 10};
              b[] = {2, 3, 1, 0, 5};
     Output : 4 10    
            
              4 and 10 are present in first array, but not 
              in second array.


      Solution : A Naive Approach is to use two loops and check 
                 element which not present in second array.  
 *              
 *              A Naive Approach is to use two loops and check element which 
 *              not present in second array.
 *              
 *              Time complexity : O(n)
                Auxiliary Space : O(n)
 * 
 * */

package hashing;

import java.util.HashSet;
import java.util.Scanner;

public class NotInFirstButSecond {

	static void inFirst(long arr1[], long arr2[]) {

		HashSet<Long> hs = new HashSet<>();

		for (int i = 0; i < arr2.length; i++) {

			hs.add(arr2[i]);
		}

		for (int i = 0; i < arr1.length; i++) {

			if (!hs.contains(arr1[i])) {

				System.out.print(arr1[i] + " ");

			}

		}

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n1 = kb.nextInt();
		int n2 = kb.nextInt();

		long arr1[] = new long[n1];
		long arr2[] = new long[n2];

		for (int i = 0; i < n1; i++) {

			arr1[i] = kb.nextLong();
		}

		for (int i = 0; i < n2; i++) {

			arr2[i] = kb.nextLong();
		}

		inFirst(arr1, arr2);

	}

}
