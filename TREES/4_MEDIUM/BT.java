import java.util.*;
class Solution{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree{
		static int idx = -1;
		public static Node builtTree(int nodes[]){
			idx++;
			if(nodes[idx] == -1) return null;
			Node newNode = new Node(nodes[idx]);
			newNode.left = builtTree(nodes);
			newNode.right = builtTree(nodes);
			return newNode;
		}

		public static void preOrderTraverse(Node root){
			if(root == null) return;
			System.out.print(" "+root.data+" ");
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);
		}

	}

	public static void main(String[] args){
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.builtTree(nodes);
		System.out.println("Root Node : "+root.data);

		System.out.println("\nPre-Ordered Traversal : ");
		tree.preOrderTraverse(root);

	}
}
