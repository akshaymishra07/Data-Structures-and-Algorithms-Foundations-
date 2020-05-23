/*
 *  A string is said to be palindrome if traversed from
 *  both start and end , it is same.
 *  
 *   i.e aba , abba , NAMAN , NITIN 
 *   
 *  ---Approach---
 *  
 *   Converting the string to character and array and using
 *   two pointers approach.
 *   
 *   We will initialize one pointer at the start of the string
 *   and another pointer at the end of the string. We will compare
 *   the characters until we reach the middle of the string.
 *   
 *   If all the chars at strt and end were same , then the
 *   string is palindrome , otherwise it is not.
 * 
 * */


package strings;

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(String str){
		
		char arr[] = str.toCharArray();
		
		int start = 0 ; 
		int end   = arr.length-1;
		
		while(start < end){
			
			if(arr[start] != arr[end]) {
				return false;
			}
			
			start++;
			end--;
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String input = kb.next();
		input = input.toLowerCase();
		boolean result = isPalindrome(input);
		
		if(result) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		
		
		
	}
	
}
