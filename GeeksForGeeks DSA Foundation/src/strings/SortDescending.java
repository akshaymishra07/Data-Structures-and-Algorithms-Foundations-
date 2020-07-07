
/* 
 *   Given a string S containing only lower case alphabets, the 
 *   task is to sort it in lexigraphically-descending order.
 *   
 *   
 *   
 *   
 *   An efficient approach will be to observe first that there can 
 *   be a total of 26 unique characters only. So, we can store the 
 *   count of occurrences of all the characters from �a� to �z� in 
 *   a hashed array. The first index of the hashed array will 
 *   represent character �a�, second will represent �b� and so on. 
 *   Finally, we will simply traverse the hashed array and print 
 *   the characters from �z� to �a� the number of times they 
 *   occurred in input string.
 *   
 *   
 *   Time : O(n) : n is length of the string
 *   Auxiliary space : O(1) : character count array used is of
 *                            size 26 , hence constant space.
 * 
 * */

package strings;

import java.util.Scanner;

public class SortDescending {

	static String sort(String str) {
		int count[] = new int[26];
		String result = "";
		for (int i = 0; i < str.length(); i++) {

			count[str.charAt(i) - 'a']++;
		}

		for (int i = 25; i >= 0; i--) {

			while (count[i] > 0) {
				result += (char) ('a' + i);
				count[i]--;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		String result = sort(str);

		System.out.println(result);

	}

}
