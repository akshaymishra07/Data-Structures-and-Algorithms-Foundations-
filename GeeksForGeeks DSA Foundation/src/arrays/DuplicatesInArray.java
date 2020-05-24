/*
 * Given an array of integers, 1 <= a[i] <= n (n = size of array), some elements appear twice 
 * and others appear once.Find all the elements that appear twice in this array.

    Could you do it without extra space and in O(n) runtime?

    Example:
    Input:
    [4,3,2,7,8,2,3,1]

    Output:
    [2,3]
    
    Constraint : If the size of the array in n  , then the maximum value 
                 present in the array should be n;
                 
                 e.g if array.length = 8
                        then maximum in the array <= 8
    
    ----Bruteforce Approaches----
     
    1. Traversing whole array once for every element in the array , 
       and determining its count in the array.
      
       Time Complexity : O(n^2)
    
    2. Sorting the array and checking the adjacent elements and
       if the adjacent elements are same then they are not printed
       
       Time Complexity : O(nlogn + n)
    
    3. Using hashmap for the storing the count of the elements present
       in the array. HashMap can be traversed later and keys having 
       count equal to 2 are printed.
       
       Time Complexity  : O(n);
       Space Complexity : O(n);
       
       
    ----Optimized Approach----   
    
 * 
 * */





package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesInArray {
	// BRUTEFORCE SOLUTION USING HASHMAP
	static void printDuplicatesBF(int arr[]) {
		HashMap<Integer , Integer> hm = new HashMap<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(hm.containsKey(arr[i])) {
				
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else 
				hm.put(arr[i], 1);
			
		}
		
		 for(Map.Entry entry : hm.entrySet()) {
			 
			 int n  = (int)entry.getValue();
			 
			 if(n == 2) {
				 System.out.print(entry.getKey() +" " );
			 }
			 
			 
		 }
		
		 System.out.println();
		
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();

		}
		
		printDuplicatesBF(arr);
		
		

	}

}
