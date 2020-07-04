package trees;

/*Given a binary tree , write a function that will resturn the node with the
maximum value in the tree.


BinaryTreeNode{

  int key;
  Node left , right;

  BinaryTreeNode(int n){
   this.key = n;
   left = right = null;

  }


}



int getMax(BinaryTreeNode root){
  
     if(root == null){
        return Integer.MIN_VALUE;
     }
     else
     return Math.max(root.key , Math.max(getMax(root.left) , getMax(root.right)));
   

}

  Time Complexity  : O(n) -> n is number of nodes in the tree
  Auxilliary Space : O(h) -> h is height of the tree

*/





/*
public class MaximumInBinaryTree {

	public static void main(String[] args) {
		
		

	}

}*/
