/*
 *   
 *   Given a string S, write a program to title case every first 
 *   letter of words in string.
 *   
 *   i/p -> akshay kumar mishra
 *   o/p -> Akshay Kumar Mishra
 *   
 *   
 * 
 * 
 * */



package strings;

import java.util.Scanner;

public class TitleCase {

	static String toTitleCase(String str) {

		char arr[] = str.toCharArray();
        
		int c = arr[0];
		c = c - 32;
		arr[0] = (char) c;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ' ') {

				if ((int) arr[i + 1] >= 97 && (int) arr[i + 1] <= 122) {

					int ch = arr[i + 1];
					ch = ch - 32;
					arr[i + 1] = (char) ch;

				}

			}
 
		}
      
		
		return String.valueOf(arr);

	}

	
	
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();

		System.out.println(toTitleCase(str));

	}

}
