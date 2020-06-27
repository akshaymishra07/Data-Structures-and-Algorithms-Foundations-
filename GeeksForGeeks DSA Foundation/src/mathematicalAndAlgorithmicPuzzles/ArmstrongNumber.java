/*
 *    For a given 3 digit number, find whether it is armstrong
 *    number or not. An Armstrong number of three digits is an 
 *    integer such that the sum of the cubes of its digits is 
 *    equal to the number itself. 
 *    
 *    
 *    For example, 371 is an Armstrong number 
 *    since 3^3 + 7^3 + 1^3 = 371
 * 
 * 
 * */


package mathematicalAndAlgorithmicPuzzles;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static boolean isArmstrong(int n) {
		
		int copy = n;
		int sum  = 0;
		while(n > 0) {
		  
			int num = n%10;
			sum += num * num * num;
			
			n/=10;
			
		}
		
		if(sum == copy) {
			
			return true;
		}else
			return false;
		
		
	}

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in );
		
		int n = kb.nextInt();
		
		boolean result = isArmstrong(n);
		System.out.println(result);

	}

}
