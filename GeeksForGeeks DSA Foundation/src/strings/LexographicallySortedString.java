/*
 *   
 *   Return the lexographically smallest subsequence 
 *   of the input string .
 *   
 *   Solution : 
 *   We have to print all the distinct characters of the input
 *   string exactly once.
 *   
 *   input  : cdabkkjaabc
 *   output : abcdjk
 *   
 *   
 *   We are using a hash table to store the occurrences of a 
 *   character in the string and we can then traverse the
 *   hash table to print all the characters which are occurring
 *   in a lexographically sorted manner.
 *  
 * */


package strings;

import java.util.Scanner;

public class LexographicallySortedString {

	static String lexSortedSubsequnce(String str) {
		StringBuffer result = new StringBuffer();
		int arr[] = new int[26];

		for (int i = 0; i < str.length(); i++) {

			arr[str.charAt(i) - 'a']++;

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				int ch = i + 97;

				result.append((char) ch);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		String result = lexSortedSubsequnce(str);

		System.out.println(result);
	}

}
