package arrays;

public class ArrayRotation {

	// This method takes auxiliary space and the time complexity
	// is O(n) : n is the size of the array
	static void simpleLeftRotationByK(int arr[], int k) {
		int tempArray[] = new int[k];
		int n = arr.length;
		for (int i = 0; i < k; i++) {
			tempArray[i] = arr[i];
		}

		for (int i = k; i < n; i++) {

			arr[i - k] = arr[i];

		}
       
	    int i = n - k;
	    
	    for(int j = 0 ; j < tempArray.length ; j++) {
	    	
	        arr[i] = tempArray[j];
	        i++;
	    	
	    }
	}
	
	

	static void leftRotateByOne(int arr[]) {
		int n = arr.length;
		int temp = arr[0];

		for (int i = 0; i < n - 1; i++) {

			arr[i] = arr[i + 1];

		}

		arr[n - 1] = temp;

	}

	/*To rotate an array by k places counter clockwise without using any auxiliary space we can use call the
	 * leftRotateByOne function k times , Time complexity will be O(n*k) : where n is size of the array */
	
	static void leftRotateByK(int arr[] , int k) {
		
		for(int i = 0 ; i < k ; i++) {
			
			leftRotateByOne(arr);
		}
		
	}
	
	
	
	
	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5  };

	    leftRotateByK(arr, 2);
		printArray(arr);

	}

}
