/*
 *    Given a root of a tree, and an integer k. 
      Print all the nodes which are at k distance from root.

      //Represtation of Tree 
      BinaryTreeNode{
         int key;
         BinaryTreeNode left , right;

         BinaryTreeNode(int n ){
            this.key = n;
            left=right=null;
         }

      }


      void printKDistant(BinaryTreeNode root , int k){
    
         if(root == NULL){
               return;
         }
         if(k == 0){
        
               System.out.print(root.key + " ");
               return; 
         }
      
         else{
       
           printKDistant(root.left  , k-1 );
           printKDistant(root.right , k-1 );        
         }   
       }

       Time  : O(n)
       Space : O(h)
 * 
 * 
 * */




/*
package trees;

import java.util.Scanner;

public class KDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Scanner kb = new Scanner(System.in);
		 
		 
		 int n = kb.nextInt();
		 int  arr[] = new int[n];
		  for(int i = 0 ; i < n ; i++) {
			  
			  arr[i] = kb.nextInt();
			  
		  }
		  
		 

	}

}*/
