class Solution{
	static class Node{
		Node left;
		Node right;
		int val;
		Node(int val){
			this.left = null;
			this.right = null;
			this.val = val;
		}
	}

	static class binaryTree{
		static int idx = -1;
		public static Node buildTree(int nodes[]){
			idx++;
			if(nodes[idx] == -1) return null;
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

		public static void printNode(Node root){
			if(root == null) return;
			System.out.println("|"+root.val+"|");
			printNode(root.left);
			printNode(root.right);
		}

		public static boolean isIdentical(Node root,Node subRoot){

			if(root == null && subRoot == null) return true;

			if(root == null || subRoot == null) return false;

			if(root.val != subRoot.val) return false;

			boolean left = isIdentical(root.left,subRoot.left);
			boolean right = isIdentical(root.right,subRoot.right);

			return left && right;
		}

		public static boolean isSubTree(Node root,Node subRoot){
			if(root == null) return false;

			if(root.val == subRoot.val){
				if(isIdentical(root,subRoot)){
					return true;
				}
			}

			boolean left = isSubTree(root.left,subRoot);
			boolean right = isSubTree(root.right,subRoot);

			return left || right;
		}
	}
	public static void main(String[]args){
		int nodes[] = {3,4,1,-1,-1,2,-1,-1,5,-1,-1};
		binaryTree tree = new binaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.val);
		System.out.println(root.left.val);
		tree.printNode(root);
		System.out.println(tree.isSubTree(root,root.left));
	}
}
