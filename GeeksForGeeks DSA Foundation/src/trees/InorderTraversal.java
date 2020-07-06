package trees;
class BinaryTreeNode{
	
	int key;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int n){
		
		key = n;
		left = null;
		right = null;
		
	}
	
}

public class InorderTraversal {
	
	void inorder(BinaryTreeNode root) {
		
		if(root != null) {
			
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right) ;
		}
	}

}
