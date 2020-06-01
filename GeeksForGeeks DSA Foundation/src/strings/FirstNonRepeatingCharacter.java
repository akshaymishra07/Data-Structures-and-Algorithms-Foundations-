/*
 *   Given a string of length n , our task is to find first
 *   non repeating character in the string;
 *   
 *   Bruteforce approach involves 2 loops and time 
 *   complexity will be O(n^2).
 *   
 *   Optimized approach involves the use of hashmap 
 *   to keep the count of the characters and the 
 *   time complexity is O(N) with space complexity O(N);
 * 
 * */


package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	
	
static String firstNonRep(String str){
        
        Map<Character , Integer> mp = new LinkedHashMap<>();
        
        for(int i = 0 ; i < str.length() ; i++){
            
            if(mp.containsKey(str.charAt(i))){
                
                mp.put(str.charAt(i)  , mp.get(str.charAt(i))+1);
                
            }
            else
               mp.put(str.charAt(i) , 1);
            
        }
        
        for(Map.Entry entry : mp.entrySet()){
            
            if((int)entry.getValue()==1){
                return ""+entry.getKey();
            }
            
        }
        
        return "-1";
    }
    	

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String s = kb.next();
		
		System.out.println(firstNonRep(s));

	}

}
