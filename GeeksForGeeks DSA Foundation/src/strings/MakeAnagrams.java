/*
 *    Given two strings S1 and S2 in lowercase, the task is 
 *    to make them anagram. The only allowed operation is 
 *    to remove a character from any string. Find the 
 *    minimum number of characters to be deleted to make 
 *    both the strings anagram. Two strings are called 
 *    anagram of each other if one of them can be converted 
 *    into another by rearranging its letters.
 *    
 *    
 *    Solution : 
 *    
 *    
 *    Use frequency array to store occurence of 
 *    characters and then check if both the frequency array 
 *    are same or not. Then remove the extra characters from 
 *    both the strings.
 *    
 *    >>better approach will be updated soon.
 * */


package strings;

import java.util.Scanner;

public class MakeAnagrams {

	public static int remAnagrams(String s, String s1) {

		int arr1[] = new int[26];
		int arr2[] = new int[26];
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			arr1[(int) s.charAt(i) - 'a']++;

		}

		for (int i = 0; i < s1.length(); i++) {

			arr2[(int) s1.charAt(i) - 'a']++;

		}

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i]) {

				count = count + Math.abs(arr1[i] - arr2[i]);
			}

		}

		return count;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str1 = kb.next();
		String str2 = kb.next();
		
		int result = remAnagrams(str1 , str2);
         
		System.out.println(result);
		
	}

}
