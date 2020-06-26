package hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNonRepeatingElements {
	
	static int countNonRep(int arr[]) {
		
		Map<Integer , Integer> hm = new LinkedHashMap<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            
            if(hm.containsKey(arr[i])){
                
                hm.put(arr[i] , hm.get(arr[i])+1);
            }
            else
               hm.put(arr[i],1);
        }
        
        
    
        int count = 0;
        
        for(Map.Entry entry : hm.entrySet()){
            
            if((int) entry.getValue() == 1){
                
                count++;
            }
            
        }
        
        return count;
        
		
	}

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			arr[i] = kb.nextInt();
			
		}
		
		
		int result = countNonRep(arr);
		

	}

}
