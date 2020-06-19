package arrays;

import java.util.Scanner;

public class DivisibleSumPair {

	public static int  countDivisibleSumPairs(int arr[] , int k) {
		int count = 0 ;
		
		for(int i = 0 ; i < arr.length -  1 ; i++  ) {
			for(int j = i+1 ; j < arr.length ; j++ ) {
				
				if((arr[i]+arr[j]) % k == 0) {
					
					System.out.println(i + " " + j);
					
					count++;
				}
				
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int k = kb.nextInt();
        		
        
        int array[] = new int[n];
        
        for(int i = 0 ; i < n ; i++) {
        	array[i] = kb.nextInt();
        }
		
        int result = countDivisibleSumPairs(array, k);
        
		System.out.print(result);
	}

}
