/*
 *   Given a string of length n , our task is to find first
 *   non repeating character in the string;
 *   
 *   Bruteforce approach involves 2 loops and time 
 *   complexity will be O(n^2).
 *   
 *   Efficient approach involves the use of hashmap 
 *   to keep the count of the characters and the 
 *   time complexity is O(N) with space complexity O(N);
 * 
 *   *****UPDATE***
 *   
 *  1.Optimized Approach(Using Visited array)
 *  
 *  We can use visited arrays.
 *  
 *  We can start traversing from the right side of the string
 *  and mark in the arrays of characters as visited if it is
 *  not visited earlier.
 *  
 *  If a character is visited earlier then its index is
 *  assigned to the result variable;
 *  
 *  
 *  function  usingVisitedArray() implements this technique;
 * 
 * */

package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	static String firstNonRep(String str) {

		Map<Character, Integer> mp = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (mp.containsKey(str.charAt(i))) {

				mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);

			} else
				mp.put(str.charAt(i), 1);

		}

		for (Map.Entry entry : mp.entrySet()) {

			if ((int) entry.getValue() == 1) {
				return "" + entry.getKey();
			}

		}

		return "-1";
	}

	static char usingVisitedArray(String str) {

		boolean visited[] = new boolean[26];
		int result = -1;

		for (int i = str.length() - 1; i >= 0; i--) {

			if (visited[str.charAt(i) - 'a'] == false) {

				visited[str.charAt(i) - 'a'] = true;
			} else
				result = i;

		}

		if (result == -1) {
			return '#';
		} else
			return str.charAt(result);

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		//System.out.println(firstNonRep(str));
        
		char result = usingVisitedArray(str);
		
		if(result == '#') {
			System.out.println("Distinct Characters");
		}
		else
			System.out.println(result);
		
	}

}
