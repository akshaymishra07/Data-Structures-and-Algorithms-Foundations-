/*
 *   
 *   
 *   
 * 
 * */


package mathematicalAndAlgorithmicPuzzles;

import java.util.Scanner;

public class ReverseNumber {

	static int reverse(int n) {
		
		int rev = 0 ;
		
		while(n  > 0) {
			
			rev = rev * 10 + n % 10;
		   
			n = n / 10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		int result = reverse(n);
	    
	    System.out.println(result);

	}

}
