/*
 *    Write a method to replace all the spaces in a string S 
 *    with ‘%20’. You may assume that the string has sufficient 
 *    space (or allocated memory) at the end to hold the 
 *    additional characters,

      Note: The leading and trailing spaces should be trimmed 
      off and not replaced by %20.
 *   
 *    I/P -> Mr John Smith
 *    O/p -> Mr%20John%20Smith 
 *    
 *    I/P -> ___My Name is Khan_____  (_ denotes spaces at front and end)
 *    O/P -> My%20Name%20is%20Khan
 *    
 *    
 * */



package strings;

import java.util.Scanner;

public class URLify {
	
	static String urlify(String str){
        int s = 0 ;
        int e = str.length()-1;
        while(str.charAt(s) == ' '){
            s++;
        }
        
        while(str.charAt(e) == ' '){
            e--;
        }
        
        str = str.substring(s , e+1);
        
        str = str.replaceAll(" " , "%20");
        
        return str;
    }        

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String s = kb.nextLine();

		String result = urlify(s);

		System.out.println(result);

	}

}
