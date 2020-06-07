/*
 *   Given a string str. The task is to find the maximum 
 *   occurring character in the string str. If more than 
 *   one character occurs maximum number of time then print 
 *   the lexicographically smaller character.
 *   
 *   
 *   Solution : It can be done by storing the the count of
 *              characters in the array and simultaneously 
 *              keep the max count in a variable.
 *              
 *              Once the string is processed , traverse the 
 *              array and return the first character whoose
 *              count is equal to max
 *   
 *          imp :  'a'-'a' = 0 
 *                 'b'-'a' = 1
 *                 'c'-'a' = 1
 *   
 *   
 * 
 * */

package strings;

import java.util.Scanner;

public class MaximumOccuringChar {

	static char maxOcc(String str) {

		int arr[] = new int[26];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < str.length(); i++) {

			arr[str.charAt(i) - 'a']++;

			if (arr[str.charAt(i) - 'a'] > max) {

				max = arr[str.charAt(i) - 'a'];
			}

		}

		int res = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == max) {

				res = i + 97;
				return (char) res;

			}
		}

		return (char) res;

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		char res = maxOcc(str);

		System.out.println(res);

	}

}
