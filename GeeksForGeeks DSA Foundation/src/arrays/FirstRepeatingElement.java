/*
 * Problem : Given an Array of length n;
 *           The array may have repeating elements. We have to print
 *           the first repeating element of the array.
 *           
 *           eg. 1 5 3 4 3 5 6
 *               output : 5
 *               first element which is repeating is 5 
 *               
 *               1 2 3 4
 *               output = -1
 *               Since there are no repeating elements
 *               
 *               1 2 5 3 3 4
 *               output = 3
 *               first and only  repeating element is 3 
 *               
 *        
 *     SOLTION : We are using HashMap here to store the first occurance of 
 *               an element into the map. When the same element is encountered
 *               again we check for the min index and if less we update it;
 *               
 *               At last we return the element at min index after completing
 *               the traversal of the whole array !!
 *               
 *               Time Complexity:  O(n)
 *               Space Complexity : O(n)
 *            
 *            
 * 
 * 
 * 
 * 
 * */




package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingElement {

	static int firstRepeatingElement(int arr[]) {
		
		HashMap<Integer , Integer> hm = new HashMap<>();
		int mini = -1;
		boolean gotFirst = false;
		
		 for(int i = 0 ; i < arr.length ; i++){
	            
	            if(hm.containsKey(arr[i]) && gotFirst == false){
	                
	                mini  = hm.get(arr[i]);
	                gotFirst = true;
	                
	            }
	            else if(hm.containsKey(arr[i]) && gotFirst == true){
	                
	                if(hm.get(arr[i]) < mini){
	                    mini = hm.get(arr[i]); 
	                }
	                
	            }
	            else
	              hm.put(arr[i] , i);
	            
	        }
		
		 if(mini == -1) {
			 return -1;
		 }
		 return arr[mini];
		
	}
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();

		}
		
		int result = firstRepeatingElement(arr);
		
		System.out.println(result);
				

	}

}
