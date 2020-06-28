
/*
 * 
 * */

/*
 *    Given a string S. The task is to find the first repeated 
 *    character in it. We need to find the character that occurs 
 *    more than once and whose index of second occurrence is 
 *    smallest. S contains only lowercase letters.
 * 
 *    i/p->  geeksforgeeks
 *    o/p->  e
 * 
 *    i/p -> hello
 *    o/p -> l 
 *    
 *    Solution : We are maintaining the list of characters 
 *               in the string , as soon as we ecounter the
 *               first repeating element while traversing 
 *               we return it , as it is the second occurence
 *               at the minimum index;
 *    
 *     *****UPDATE***
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
 * 
 *   
 * 
 * */

package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstRepeatingCharacter {
	
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

	static char firstRepeating(String str) {

		List<Character> li = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			if (li.contains(str.charAt(i))) {
				return str.charAt(i);
			} else {

				li.add(str.charAt(i));
			}

		}

		return '1';

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		/*
		 * char result = firstRepeating(str);
		 * 
		 * if(result == '1') { System.out.println("-1"); } else
		 * System.out.println(result);
		 */

		char result = usingVisitedArray(str);

		if (result == '#') {
			System.out.println("Distinct Characters");
		} else
			System.out.println(result);

	}

}
