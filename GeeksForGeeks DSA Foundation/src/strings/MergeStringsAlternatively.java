package strings;

import java.util.Scanner;

public class MergeStringsAlternatively {
	
	static String mergeStrings(String s1 , String s2){
        
        // To store the final string 
       StringBuilder result = new StringBuilder(); 
 
       // For every index in the strings 
       for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
 
           // First choose the ith character of the 
           // first string if it exists 
           if (i < s1.length()) 
               result.append(s1.charAt(i)); 
 
           // Then choose the ith character of the 
           // second string if it exists 
           if (i < s2.length()) 
               result.append(s2.charAt(i)); 
       } 
 
       return result.toString(); 
       
       
       
   }
	
	

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str1 = kb.next();
		String str2 = kb.next();

		String result = mergeStrings(str1, str2);

		System.out.println(result);

	}

}
