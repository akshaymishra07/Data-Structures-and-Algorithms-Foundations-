package mathematicalAndAlgorithmicPuzzles;

import java.util.Scanner;

public class FloydsTrianagle {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int number = 1;
		for(int i = 1 ; i <= n ; i++) {
			
			//nested for loop for spaces
			
			for(int s = n ; s > i ; s-- ) {
				
				System.out.print(" ");
				
				
			}
			
			//NESTED FOR LOOP FOR PRINTING THE NUMBERS
			
			for(int j = 1 ;  j <= i ; j++) {
				System.out.print(number + " ");
				number++;
				
			}
			
			System.out.println();
			
		}
		
	}

}
