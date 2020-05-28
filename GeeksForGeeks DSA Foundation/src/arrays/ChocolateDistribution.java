/*
 * 
 *    Given an array A of positive integers of size N, where each value 
 *    represents number of chocolates in a packet. Each packet can have 
 *    variable number of chocolates. There are M students, the task is to 
 *    distribute chocolate packets such that :
      
      1.Each student gets one packet.
      2.The difference between the number of chocolates given to the students 
        having packet with maximum chocolates and student having packet 
        with minimum chocolates is minimum.
 * 
 *    
 *    Example 1 :   8
             		3 4 1 9 56 7 9 12
             		5
 *                
 *                O/P --> 6
 *                
 *    Example 2 :  7 
 *                 7 3 2 4 9 12 56
 *                 3 
 *                 
 *                 O/P --> 2             
 *         
 *         
 *         
 *    Solution : We will sort the array and find the difference between the
 *               first and last elements of all the subsets of size m;
 *               
 *               We will return the minimum differnce of all.s
 *         
 * 
 * */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {

	static int bestDistribution(int arr[], int m) {
       
		int n = arr.length;
		int minDiff = Integer.MAX_VALUE;
		int diff = 0 ;
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < n - m + 1 ; i++){
			
			diff = arr[i+m-1] - arr[i];
			
			if(diff < minDiff) {
				minDiff =diff;
			}
			
		}
		
		
		return minDiff;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		int m = kb.nextInt();

		int result = bestDistribution(arr, m);

		System.out.println(result);

	}

}
