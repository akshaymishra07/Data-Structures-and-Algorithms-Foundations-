/*
 *   In this problem , we have to determine that if all the characters in 
 *   the given string are unique 
 *   
 *   ilovecode -> NO
 *   ilovec    -> YES
 *   
 *   ----BruteForce----
 *   
 *   For every character in the string ,traverse the whole string and check
 *   if it occurs more than one.
 *   
 *   Time complexity : 	O(n^2);
 *   
 *   -----Optimized-----
 *   
 *   We can use HashSet as It stores only unique elements , we can put all 
 *   the characters of the string in the hashset and after that we will 
 *   compare the lengths of the string with size of the hashset , if both
 *   are equal then all the characters in the string are unique . Otherwise
 *   the string has at least one repeated character.
 * 
 * 
 * 
 * 
 * */


package strings;

import java.util.HashSet;
import java.util.Scanner;

public class StringUniqueChars {
	//optimized approach 
	static boolean unique(String str) {
		
		HashSet<Character> hs = new HashSet<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			hs.add(str.charAt(i));
		}
		
		
		if(hs.size() == str.length()) {
			return true;
		}
		else 
			return false;
		
	}

	public static void main(String[] args) {
	       
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		boolean result = unique(str);
		
		if(result) {
			System.out.println("Yes");
		}
		else 
			System.out.println("NO");

	}

}
