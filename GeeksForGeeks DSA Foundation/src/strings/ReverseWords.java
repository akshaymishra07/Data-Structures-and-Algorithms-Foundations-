/*
 *   Reverse the words of a string.
 *   
 *   Example : i/p -> I like this program
               o/p -> program this like I
*/


package strings;

import java.util.Scanner;

public class ReverseWords {

	static void revWords(String str) {
          
		String arr[] = str.split(" ");
  
	  	 
		
		
		for (int i = arr.length - 1; i > 0; i--){

			System.out.print(arr[i]+" ");
		}

		System.out.print(arr[0]);

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();
		
		revWords(str);

		
		
		
	}

}
