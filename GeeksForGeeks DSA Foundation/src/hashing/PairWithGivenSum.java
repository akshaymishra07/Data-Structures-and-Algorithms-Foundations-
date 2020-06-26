package hashing;

import java.util.ArrayList;
import java.util.Scanner;

public class PairWithGivenSum {

	public static int sumExists(int arr[], int sum) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (list.contains(sum - arr[i])) {
				return 1;
			}

			list.add(arr[i]);

		}

		return 0;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();

		}

		int sum = kb.nextInt();

		int result = sumExists(arr, sum);
         
		System.out.println(result);
		 
		
	}

}
