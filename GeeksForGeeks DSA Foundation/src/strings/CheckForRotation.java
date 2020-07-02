/*
 *   Given two strings , check whether the second string is
 *   rotation of first string.
 *   
 *   T-> O(n)
 *   S-> O(n)
 * */

package strings;

import java.util.Scanner;

public class CheckForRotation {
	
	static boolean isRotation(String s1 , String s2) {
		
		if(s1.length() != s2.length()) {
			
			return false;
		}
		
		
		return((s1+s1).indexOf(s2) >= 0);
	}

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

		String s1 = kb.next();
		String s2 = kb.next();
		
		boolean result = isRotation(s1 , s2);
		
		if(result) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
