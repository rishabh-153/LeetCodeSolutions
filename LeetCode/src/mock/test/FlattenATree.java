package mock.test;

public class FlattenATree {
	public static void flatten(TreeNode root) {
		 TreeNode curr = root;
	        while (curr != null) {
	            if (curr.left != null) {
	                TreeNode predecessor = curr.left;
	                while(predecessor.right != null) predecessor = predecessor.right;
	                predecessor.right = curr.right;
	                curr.right = curr.left;
	                curr.left = null;
	            }
	            curr = curr.right;
	        }
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4,null,null),new TreeNode(5,null,null)),new TreeNode(3,new TreeNode(6,null,null),new TreeNode(7,null,null)));
		flatten(root);
	}

}
