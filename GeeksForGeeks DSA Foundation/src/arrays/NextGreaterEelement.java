/*
 *   Given an array of size n , for each element in the array 
 *   print the next greater element to the right side of the
 *   corresonding element.
 *   
 *   Example : I/P 3 5 2 1 7 4 3 6 8 1
 *               
 *             O/P 5 7 7 7 8 6 6 8 -1 -1
 *             
 *   Note: If there are no greater elements to the right side 
 *         then print -1 ;
 *         
 *                   
 *    -----BruteForce Solution----               
 *         Using 2 pointers and for every element in the array
 *         travlling the whole array to find the next 
 *         greater element.
 *         
 *         Time complexity : O(n^2)
 *         
 *   
 *    ----Optimized Solution-----
 *      NGE - NEXT GREATER ELEMENT
 *    
 *        We will start traversing the array from last 
 *        We will use a stack to keep the track of next greater
 *        element.
 *        
 *        We will pop all the smaller elements from the stack
 *        and if we get the greater element than current array element
 *        then that is our NGE and if the stack becomes empty then it 
 *        suggests that the current element has no NGE , print -1;
 *             
 * 
 * 
 * */

package arrays;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterEelement {

	static int[] nextGreaterElement(int arr[]) {

		Stack<Integer> st = new Stack<>();
		int result[] = new int[arr.length];
		int resultIndex = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (!st.isEmpty()) {

				while (!st.isEmpty() && st.peek() <= arr[i]) {

					st.pop();

				}

			}

			if (st.isEmpty()) {

				result[resultIndex] = -1;
				resultIndex--;
			} else {
                 
				result[resultIndex] = st.peek();
				resultIndex--;
 			}
			
			
			
			
			st.push(arr[i]);

		}

		
		return result;
	}

	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length ; i++) {

			System.out.print(arr[i] + " ");

		}
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();
		}
		
		int result[] = nextGreaterElement(arr);
		
		printArray(result);

	}

}
