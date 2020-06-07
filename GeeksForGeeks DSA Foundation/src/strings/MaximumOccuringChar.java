package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccuringChar {
	
	static char maxOcc(String str) {
		
	
	        
		      Map<Character , Integer> mp = new LinkedHashMap<>();
		      int  max     = Integer.MIN_VALUE;
		      char maxChar ='a';
		      
		      for(int i = 0 ; i < str.length() ; i++){
		          
		          
		            
		            if(mp.containsKey(str.charAt(i))){
		                
		                mp.put(str.charAt(i)  , mp.get(str.charAt(i))+1);
		                
		            }
		            else
		               mp.put(str.charAt(i) , 1);
		            
		        
		      }
		      
		      int arr[] = new int[26];
		      
		      for(Map.Entry entry : mp.entrySet()){
		            
		            if((int)entry.getValue() > max){
		                 
		                 max = (int)entry.getValue();
		                 maxChar = (char)entry.getKey();
		                 arr[(int)maxChar-'a']++;
		            }
		            
		            
		        }
		        
		        int ch = Character.MIN_VALUE ;
		        for(int i = 0 ; i < arr.length ; i++){
		            
		            if(arr[i] == max){
		                
		                ch =  i+97;
		            }
		            
		        }
		      
		      return (char)ch;        
		    }
		
		
		
	
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		char res = maxOcc(str);
		
		System.out.println(res);

	}

}
