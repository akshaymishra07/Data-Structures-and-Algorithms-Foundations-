package mathematicalAndAlgorithmicPuzzles;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
		
    	Scanner kb = new Scanner(System.in);
    	
    	
    	System.out.println("Enter the number of terms in the series");
    	int n = kb.nextInt();
    	
    	
    	for(int i = 1; i <= n ; i++) {
    		
    		System.out.print(fibo(i) + " ");
    	}
    	
	}
    
    public static int fibo(int n) {
    	
    	if(n < 2) {
    		return n; 
    		
    	}
    	else {
    		
    		return fibo(n-1) + fibo(n-2);
    	}
    	
    }
	
}
