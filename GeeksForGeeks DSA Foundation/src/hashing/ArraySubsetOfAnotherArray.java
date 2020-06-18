/*
 *    Given two arrays: arr1[0..m-1] of size m and arr2[0..n-1] of size n. Task is to check whether arr2[] is a subset of arr1[] or not. Both the arrays can be both unsorted or sorted. It may be assumed that elements in both array are distinct.
 * 
 *     
 *    Solution: 
 *    
 *    ------>>BruteForce>>------
 *    
 *    Use two loops: The outer loop picks all the elements of arr2[] one by one. The inner loop linearly searches for the element picked by the outer loop. If all elements are found then return 1, else return 0.
 *    
 *    
 *    ------------->>Optimized>>-----------
 *    
 *    Create a Hash Table for all the elements of arr1[].
      Traverse arr2[] and search for each element of arr2[] in the Hash Table. If element is not found then return 0.
      If all elements are found then return 1.
 *       
 * 
 * */




package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraySubsetOfAnotherArray {

	static boolean isSubArray(int arr1[], int arr2[]) {

		Set<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);

		}

		for (int i = 0; i < arr2.length; i++) {

			if (!hs.contains(arr2[i])) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		for (int i = 0; i < n1; i++) {

			arr1[i] = kb.nextInt();

		}

		for (int i = 0; i < n2; i++) {

			arr2[i] = kb.nextInt();

		}

		boolean result = isSubArray(arr1, arr2);

		if (result) {
			System.out.println("Yes");

		} else
			System.out.println("No");

	}

}
