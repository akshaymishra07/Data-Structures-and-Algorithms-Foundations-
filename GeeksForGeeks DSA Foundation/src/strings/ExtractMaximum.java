/*
 *    
 *    
 *    You have been given an alphanumeric string S, extract maximum 
 *    numeric value from that string. Alphabets will only be in lower 
 *    case.
 *       
 *    
 *    Example
 *      I/P->	100klh564abc365bg
 *      O/P->   564
 *      
 *      I/P-> abvhd9sdnkjdfs
 *      O/P-> 9
 * 
 * 
 * 
 * 
 * */



package strings;

import java.util.Scanner;

public class ExtractMaximum {

	static int extractMax(String str) {

		int num = 0, res = 0;

		// Start traversing the given string
		for (int i = 0; i < str.length(); i++) {
			// If a numeric value comes, start converting
			// it into an integer till there are consecutive
			// numeric digits
			if (Character.isDigit(str.charAt(i)))
				num = num * 10 + (str.charAt(i) - '0');

			// Update maximum value
			else {
				res = Math.max(res, num);

				// Reset the number
				num = 0;
			}
		}

		// Return maximum value
		return Math.max(res, num);

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		int result = extractMax(str);

		System.out.println(result);

	}

}
