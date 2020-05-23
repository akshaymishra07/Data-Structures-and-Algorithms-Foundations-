/* An anagram of a string is another string that contains same 
 * characters, only the order of characters can be different. 
 * For example, “abcd” and “dabc” are anagram of each other.
 * 
 *    eg: LISTEN   <--> SILENT	
 *        TRIANGLE <--> INTEGRAL
 *        
 * ----BruteForce Approach----
 * 
 *    Sort both the strings and compare the characters on the same
 *    indexes of both the strings , it should be same for the two
 *    strings to be anagram of each other
 *    
 * ----OPTIMIZED APPROACH ----    
 * 
 *    	We are using hashmap here , we will traverse the first string
 *      and store the character counts in the hashmap and then we will
 *      traverse the second string and then subtract the occurance from
 *      the hash map , at the end , all the values in the hashmap should
 *      be zero for two strings being the anagrams.
 *      
 *      If there is any non zero value in the hashmap then the strings 
 *      are not anagrams.
 * 
 * */

package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	// BruteForce Approach
	static boolean areAnagrams(String str1, String str2) {

		if (str1.length() != str2.length()) {

			return false;
		}

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}

	// Optimized Approach

	static boolean areAnagram(String str1, String str2) {

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {

			if (hm.containsKey(str1.charAt(i))) {

				hm.put(str1.charAt(i), hm.get(str1.charAt(i)) + 1);

			} else {
				hm.put(str1.charAt(i), 1);

			}

		}
		
		for(int i = 0 ; i < str2.length() ; i++) {
			
			if(hm.containsKey(str2.charAt(i))) {
				
				hm.put(str2.charAt(i), hm.get(str2.charAt(i)) - 1);
			}
			else
				return false;
		}
		
		for(Map.Entry entry : hm.entrySet()){
			
			int n =(int)entry.getValue();
			if( n != 0) {
				return false;
			}
			
		}
		
       return true;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String input1 = kb.next();
		String input2 = kb.next();
        
		//CALLING OPTIMIZED SOLUTION
		boolean result = areAnagram(input1, input2);

		//CALLING BRUTEFORCE SOLUTION
		boolean result1 = areAnagrams(input1, input2);
		if (result) {
			System.out.println("YES");
		} else
			System.out.println("NO");
		
		kb.close();

	}

}
