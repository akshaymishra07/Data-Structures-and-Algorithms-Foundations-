package trees;


public class PreorderTraversal {
	
	void preorder(BinaryTreeNode root) {
		
		if(root != null) {
			
			
			System.out.print(root.key + " ");
			preorder(root.left);
			preorder(root.right) ;
		}
	}

}
