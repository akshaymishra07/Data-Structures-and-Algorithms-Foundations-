/*
 *   Given a string of length n , our task is to find first
 *   non repeating character in the string;
 *   
 *   Bruteforce approach involves 2 loops and time 
 *   complexity will be O(n^2).
 *   
 *   Efficient approach involves the use of hashmap 
 *   to keep the count of the characters and the 
 *   time complexity is O(N) with space complexity O(N);
 * 
 *   Note: This question is also called leftmost non-repeating
 *         element , and it is commonly asked in technical 
 *         interviews.
 *         
 *   *************************UPDATE*******************     
 *   Use of HashMap is not always favorable as it needs 
 *   O(n) auxiliary space. 
 *   
 *   The most efficient approach is using an array which 
 *   will store the first indexes of the non-repeating
 *   characters present in the string.
 *   
 *   It will take only one traversal of the string 
 *   and O(1) auxiliary space;
 *   
 *   This approach is implemented in 
 *   usingFirstIndexArray() method;
 *    
 *               
 *         
 *   
 * 
 * */

package strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	static char usingFirstIndexArray(String str) {
		int firstIndex[] = new int[26];
		Arrays.fill(firstIndex, -1);

		for (int i = 0; i < str.length(); i++) {

			if (firstIndex[str.charAt(i) - 'a'] == -1) {

				firstIndex[str.charAt(i) - 'a'] = i;

			}
			else
				firstIndex[str.charAt(i) - 'a'] = -2;

		}
		
		int result = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < firstIndex.length ; i++) {
			
			if(firstIndex[i] >= 0 ) {
				
				result = Math.min(result , firstIndex[i]);
			}
		}

		if(result == Integer.MAX_VALUE ) {
			
			return '#';
		}
		else
			return str.charAt(result);
		
	}

	static String firstNonRep(String str) {

		Map<Character, Integer> mp = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (mp.containsKey(str.charAt(i))) {

				mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);

			} else
				mp.put(str.charAt(i), 1);

		}

		for (Map.Entry entry : mp.entrySet()) {

			if ((int) entry.getValue() == 1) {
				return "" + entry.getKey();
			}

		}

		return "-1";
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		//System.out.println(firstNonRep(str));

		char result = usingFirstIndexArray(str);
		
		if(result == '#'){
			
			System.out.println("No Non_Repeating Character");
		}
		else
			System.out.println(result);
		
		
	}

}
