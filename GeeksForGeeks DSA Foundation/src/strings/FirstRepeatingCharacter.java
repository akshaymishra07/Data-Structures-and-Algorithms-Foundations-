
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
 * 
 * 
 * */

package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstRepeatingCharacter {

	static char firstRepeating(String str) {
		
		List<Character> li = new ArrayList<>();
		
		for(int i = 0 ; i < str.length() ; i++ ) {
			
			if(li.contains(str.charAt(i))) {
				return str.charAt(i);
			}
			else{
				
				li.add(str.charAt(i));
			}
			
			
		}
		
		
		return '1';
		
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		char result = firstRepeating(str);
		
		if(result == '1') {
			System.out.println("-1");
		}
		else
			System.out.println(result);

	}

}
