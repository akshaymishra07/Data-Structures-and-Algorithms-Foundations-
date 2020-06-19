package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthMinMax {

	public static void main(String[] args) {
		Scanner kb  = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr[] = new int [n];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = kb.nextInt();
			
		}
		
		int k = kb.nextInt();
		
		
		Arrays.sort(arr);
        
	    System.out.println(k+"th minimum element in the array is : "+ arr[k-1]);
	    System.out.println(k+"th maximum element in the array is : "+ arr[n-k]);
		
		
		
	}

}
