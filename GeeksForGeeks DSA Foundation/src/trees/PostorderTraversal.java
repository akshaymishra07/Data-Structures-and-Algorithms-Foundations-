package trees;

public class PostorderTraversal {

	void postorder(BinaryTreeNode root) {

		if (root != null) {

			postorder(root.left);
			postorder(root.right);
			System.out.print(root.key + " ");
		}
	}

}
