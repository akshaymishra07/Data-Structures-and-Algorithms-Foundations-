/*
 *  This is commonly asked interview question 
 *  It says compress the string such as
 *  
 *   aaaabbggghhhhi -> a4b2g3h4i
 *   aaaabbeef --> a4b2e2f
 *   
 *   constraints : if outputString.length() <= originalString.length()
 *                 then output original string;
 *                 
 *   
 *   The approach is simple : we will start traversing the array and will keep
 *                            the track of current character and its count
 *                            once the sequence breaks , we will append the
 *                            character and count to the output string.
 *                            
 *               Time complexity : O(n); n : length of the string                           
 * 
 * 
 * */


package strings;

import java.util.Scanner;

public class StringCompress {
    
	static String compressString(String str) {
		String outputString = "";
		char currentChar = str.charAt(0);
		int count = 1; 
		
		for(int i = 1 ; i < str.length() ; i++ ) {
			
			if(str.charAt(i-1) != str.charAt(i)) {
				outputString += currentChar;
				if(count>1) {
				outputString += count;
				}
				currentChar = str.charAt(i);
				count = 1 ;
				
 			}
			else {
				count++;
			}
			
		}
		
		outputString += currentChar;
		if(count>1) {
			outputString += count;
		}
		
		if(outputString.length() < str.length()) {
			
			return outputString;
			
		}
		else
			return str;
		
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		String result = compressString(str);
		
		System.out.println(result);
	

	}

}
