
/*  
 *   Find the first non-repeating element in a given 
 *   array A of N integers.
     
     Note: Array consists of only positive and negative 
           integers and not zero.
 * 
 * 
 *    I/P -> 9 4 9 6 7 4
 *    O/P -> 6
 *    
 *    I/P -> 1 1 1 2 2 2 3 3
 *    O/P -> -1
 *    
 *    
 *    Solution : Store all the elements in the hashmap with 
 *               their frequency and then return the first key 
 *               from the hashmap whoose corresponding value is
 *               1;
 *               
 *               If non of the keys has value 1 then return -1
 * 
 * 
 * */ 




package hashing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingElement {

	static int firstNonRepElement(int arr[]) {

		Map<Integer , Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {

				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else
				hm.put(arr[i], 1);
		}

		for (Map.Entry entry : hm.entrySet()) {

			if ((int) entry.getValue() == 1) {
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
		
		int result = firstNonRepElement(arr);
	       
	       System.out.println(result);

	}

}
