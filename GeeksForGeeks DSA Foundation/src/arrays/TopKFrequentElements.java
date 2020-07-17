/*
 *   
 *   Given a non-empty array of integers, return the k most 
 *   frequent elements.
 * 
 *   
 *   Algorithm :
 *   
 *   1. Initialize a Map
 *   2. Iterate over the array and store the element as key 
 *      and its no. of occurrences as value in the map
 *   3. Initialize a priority queue with custom comparator
 *   4. Add all keys in the queue based on increasing order of
 *      occurrences
 *   5. Remove value from queue until size of the queue becomes
 *      k.
 *   6. Store k elements in the resultant array and return it.
 * 
 * 
 * */

package arrays;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopKFrequentElements {

	static void printTopKFrequentElements(int arr[] , int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);
		}

		PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));

		for (int n : map.keySet()) {
			heap.add(n);
			if (heap.size() > k)
				heap.poll();
		}

		
		while(!heap.isEmpty()) {
			
			System.out.print(heap.poll()+" ");
		}
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();
		}

		printTopKFrequentElements(arr , k);

	}

}
