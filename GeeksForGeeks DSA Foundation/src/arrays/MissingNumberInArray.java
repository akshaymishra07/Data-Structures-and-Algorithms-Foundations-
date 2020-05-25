/*
 *  PROBLEM : You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 *            There are no duplicates in the list. One of the integers is 
 *            missing in the list. Write an efficient code to find the missing integer.
 *            
 *            arr.length = n-1 
 *            1 <= arr[i] <= n
 * 
 * 
 *  SOLUTION : Approach is to calculate the sum of the n natural numbers 
 *             using the conventional formula
 *               
 *            sum =  n*(n+1)/2
 *             
 *             Then we will traverse the whole array , and calculate the
 *             sum of all the elements and store it in arrSum.
 *             
 *             Our missing number num is given by ; 
 *              
 *             num = sum - arrSum ;
 * 
 * */




package arrays;

import java.util.Scanner;

public class MissingNumberInArray {

	static int findMissingElement(int arr[]) {

		int n       = arr.length+1;
		int sum     = (n * (n + 1)) / 2;
		int arrSum  = 0;

		for (int i = 0; i < arr.length ; i++) {

			arrSum += arr[i];
		}

		return sum - arrSum;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int arr[] = new int[n-1];

		for (int i = 0; i < arr.length ; i++) {

			arr[i] = kb.nextInt();
		}

		int result = findMissingElement(arr);
		
		System.out.println(result);
		
		
	}

}
