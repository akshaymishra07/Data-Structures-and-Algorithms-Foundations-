package strings;

import java.util.Scanner;

public class StringReverseRecursion {

	static String reverseRecursion(String str) {
		
		if(str.length() == 0) {
			
			return str;
		}
		
		return reverseRecursion(str.substring(1)) + str.charAt(0);
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
	     String str = kb.next();
	     
	     String result = reverseRecursion(str);
	     
	     System.out.println(result);
		
	}
}
