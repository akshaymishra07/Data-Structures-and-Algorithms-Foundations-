/* 
 *        Given an array A of N elements. Find the majority element in the array. 
 *        A majority element in an array A of size N is an element t
 *        hat appears more than N/2 times in the array.
 * 
 *        
 *        Example: 
 *                  i/p--> 3 1 3 3 2
                    o/p--> 3
 *        
 *        Note : return -1 if the array doesnt have a majority element;
 *        
 *        
 *      
 *     SOLUTION : We will use a hashMap for storing the frequency of the
 *                elements and at the end we wlll return the key in the
 *                hashMap for which the value is greater than N/2;
 * 
 * */




package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

	static int majorityElement(int arr[]) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		int factor = arr.length / 2;

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {

				hm.put(arr[i], hm.get(arr[i]) + 1);

			} else {

				hm.put(arr[i], 1);

			}
		}

		for (Map.Entry entry : hm.entrySet()) {

			if ((int) entry.getValue() > factor) {

				return (int) entry.getKey();
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

		int result = majorityElement(arr);
		System.out.println(result);

	}

}
