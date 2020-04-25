/* Description : We are given an array of positive and negative 
 * integers. We have to find the subarray having maximum sum.

		Input
		[-3, 4, -1, -2, 1, 5]
		Output
		7
		(4+(-1)+(-2)+1+5)

Solution : Simple idea is to look for all positive contiguous 
segments of the array (max_ending_here is used for this). And 
keep track of maximum sum contiguous segment among all positive 
segments (max_so_far is used for this). Each time we get a 
positive sum compare it with max_so_far and if,it is greater than
max_so_far, update max_so_far.*/




package arrays;
import java.util.Scanner;
public class LargestSumSubarray {

	
	static int findLSS(int arr[]){
		int max_so_far = Integer.MIN_VALUE;
		int max_ends_here = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			max_ends_here += arr[i];
			if(max_so_far < max_ends_here) {
				
				max_so_far = max_ends_here;
			}
			
			if(max_ends_here < 0) {
				max_ends_here = 0 ;
			}
		}
		
		return max_so_far;
	}
	
	
	public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i < n ;i++) {
			
			arr[i] = kb.nextInt();
		}
		
	int result =	findLSS(arr);
	
	System.out.println(result);
	
	}
	
}