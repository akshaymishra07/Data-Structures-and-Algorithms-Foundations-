/*
 *    
 *    Find and print the uncommon characters of the two given strings 
 *    in sorted order. Here uncommon character means that either the 
 *    character is present in one string or it is present in other 
 *    string but not in both. The strings contain only lowercase 
 *    characters and can contain duplicates.
 * 
 *    
 *    Input: str1 = “characters”, str2 = “alphabets”
      Output: b c l p r

      Input: str1 = “geeksforgeeks”, str2 = “geeksquiz”
      Output: f i o q r u z
 * 
 * 
 *    Solution
 *    
 *    Efficient Approach: An efficient approach is to use hashing.

      Use a hash table of size 26 for all the lowercase characters.
      Initially, mark presence of each character as ‘0’ (denoting that the character is not present in both 
      the strings).Traverse the 1st string and mark presence of each character of 1st string as ‘1’ 
      (denoting 1st string) in the hash table.
      Now, traverse the 2nd string. For each character of 2nd string, check whether its presence in the hash 
      table is ‘1’ or not. If it is ‘1’, then mark its presence as ‘-1’ (denoting that the character is 
      common to both the strings), else mark its presence as ‘2’ (denoting 2nd string).
 * 
 * 
 * */

package strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UncommonCharacters {

	// Optimized Approach

	static String uncommonOptimized(String s1, String s2) {
		String result = "";
		int arr[] = new int[26];

		for (int i = 0; i < s1.length(); i++) {

			arr[s1.charAt(i) - 'a'] = 1;

		}

		printArray(arr);
		System.out.println();

		for (int i = 0; i < s2.length(); i++) {

			if (arr[s2.charAt(i) - 'a'] == 1 || arr[s2.charAt(i) - 'a'] == -1) {
				arr[s2.charAt(i) - 'a'] = -1;
			} else
				arr[s2.charAt(i) - 'a'] = 2;
		}

		printArray(arr);

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1 || arr[i] == 2) {
				result += (char) (i + 'a');
			}
		}

		return result;
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
	}

	// Bruteforce Approach using Collections
	// the problem with this approach is that
	// it will not print uncommon characters in
	// sorted order;
	static String uncommon(String s1, String s2) {

		Set<Character> c1 = new HashSet<>();
		Set<Character> c2 = new HashSet<>();

		String result = "";

		for (int i = 0; i < s1.length(); i++) {
			c1.add(s1.charAt(i));
		}

		for (int i = 0; i < s2.length(); i++) {
			c2.add(s2.charAt(i));
		}

		Set<Character> c1Copy = new HashSet<>(c1);

		c1.removeAll(c2);
		c2.removeAll(c1Copy);

		Iterator v1 = c1.iterator();

		while (v1.hasNext()) {

			result += v1.next();
		}

		Iterator v2 = c2.iterator();

		while (v2.hasNext()) {

			result += v2.next();
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str1 = kb.next();
		String str2 = kb.next();

		String result = uncommonOptimized(str1, str2);

		System.out.println(result);

	}

}
