/*
 *   Given a string S, Check if characters of the given string 
 *   can be rearranged to form a palindrome. 
     
     For example characters of “geeksogeeks” can be 
     rearranged to form a palindrome “geeksoskeeg”, but 
     characters of “geeksforgeeks” cannot be rearranged to 
     form a palindrome.
 *   
 *   
 *   Solution : 
 *    
 *   Create a count array of alphabet size which is typically 
 *   256. Initialize all values of count array as 0.
     Traverse the given string and increment count of every 
     character.
     Traverse the count array and if the count array has more 
     than one odd values, return false. Otherwise return true.
 * 
 * */


package strings;

import java.util.Scanner;

public class AnagramPalindrome {

	static boolean isAnaPal(String str) {

		int arr[] = new int[26];
		int oddCount = 0;

		for (int i = 0; i < str.length(); i++) {

			arr[(int) str.charAt(i) - 'a']++;

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				oddCount++;
			}

			if (oddCount > 1) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		boolean result = isAnaPal(str);

		if (result) {

			System.out.println("Yes");
		} else
			System.out.println("No");

	}

}
