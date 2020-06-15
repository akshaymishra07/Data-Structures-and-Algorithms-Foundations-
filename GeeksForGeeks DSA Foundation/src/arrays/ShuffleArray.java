/*
 * 
 *   Given the array nums consisting of 2n elements in the 
 *   form [x1,x2,...,xn,y1,y2,...,yn].

     Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 *       
 *   Input: nums = [2,5,1,3,4,7], n = 3
     Output: [2,3,5,4,1,7] 
     Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 
     then the answer is [2,3,5,4,1,7].    
 * 
 * 
 * */


package arrays;

import java.util.Scanner;

public class ShuffleArray {

static int[] shuffle(int[] nums) {
        
        int first  = 0;
        int second = nums.length/2;
        int arr[]  = new int[nums.length]; 
        int count  = 0;
        int count1 = 1;
        
        while(second < nums.length){
            
           
            arr[count]  = nums[first];
            arr[count1] = nums[second];
            
            
            
            
            second++;
            first++;
            count+=2;
            count1+=2;
            
        }
        
        return arr;
    }
	
	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
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

		int result[] = shuffle(arr);
		printArray(result);

	}

}
