package arrays;

import java.util.Scanner;

/*    Equilibrium index of an array is an index such that the 
 *    sum of elements at lower indexes is equal to the sum of 
 *    elements at higher indexes. We are given an Array of 
 *    integers, We have to find out the first index i from left 
 *    such that -
      A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]

		Input
		[-7, 1, 5, 2, -4, 3, 0]
		Output
		3
		A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 * 
 * */

/*SOLUTION  :
 *    
 *    The idea is to get total sum of array first. Then Iterate through
 *    the array and keep updating the left sum which is initialized as 
 *    zero. In the loop, we can get right sum by subtracting the 
 *    elements one by one. Then check whether Leftsum and Rightsum 
 *    are equal.
 * 
 * */

public class EquilibriumIndex {

	static int findEquilibriumIndex(int[] arr) {
        
	            int	sum = 0;
			    int leftsum = 0;
			    for (int i=0 ; i< arr.length ; i++)
			        sum += arr[i];

			    for (int i=0 ; i< arr.length ; i++)
			    {
			        // now sum will be right sum for index i
			        sum -= arr[i];
			        
			       
			        
			        if (sum == leftsum ) {
			        	
			        	return i;
			        }
			            
			        leftsum += arr[i];
			        
			    }
		
		return -1;

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = kb.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements in the array :");
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		int result = findEquilibriumIndex(arr);
		
		if(result == -1) {
			System.out.println("Equilibrium Doesnt Exist :");
			
		}
		else
			 System.out.println("Equilibrium Index is :"+ result);
 
	}

}
