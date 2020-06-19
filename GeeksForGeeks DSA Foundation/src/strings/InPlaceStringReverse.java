package strings;

import java.util.Scanner;

public class InPlaceStringReverse {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		char array[] = str.toCharArray();
		
		int low = 0 ; 
		int high = array.length - 1;
		
		while(low < high) {
			
			char temp = array[low];
			array[low] = array[high];
			array[high] = temp ;
			
			low++;
			high--;
			
			
		}
		
		str = String.valueOf(array);
		
		System.out.println(str);

	}

}
