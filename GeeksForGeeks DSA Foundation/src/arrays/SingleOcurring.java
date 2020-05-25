/*
 *   Problem : We have an array of length n, all the elements in the array
 *   are occuring twice except one element , print the element which
 *   is occuring only once;
 *   
 *   Solution : 
 *   
 *   The best solution is to use XOR. XOR of all array elements gives us the number with single occurrence. The idea is based on following two facts.
     a) XOR of a number with itself is 0.
     b) XOR of a number with 0 is number itself.

     Let us consider the above example.  
     Let ^ be xor operator as in C and C++.

     res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4

     Since XOR is associative and commutative, above 
     expression can be written as:
     res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)  
         = 7 ^ 0 ^ 0 ^ 0
         = 7 ^ 0
         = 7 
 * 
 * 
 * 
 * */



package arrays;

import java.util.Scanner;

public class SingleMissing {

	
	static int findSingleElement(int arr[]) {
		int res= arr[0];
		
		for(int i = 1 ; i < arr.length ; i++) {
			res = res ^ arr[i];
		}
		
		return res;
		
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		
		int n = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			arr[i] = kb.nextInt();
			
		}
		
		int result = findSingleElement(arr);
		
		System.out.println(result);

	}

}
