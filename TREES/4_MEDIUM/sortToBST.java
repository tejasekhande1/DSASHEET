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

		public static Node sortToBST(int nums[],int start,int end){
			if(start > end){
				return null;
			}

			int mid = (start+end)/2;
			Node root = new Node(nums[mid]);
			root.left = sortToBST(nums,start,mid-1);
			root.right = sortToBST(nums,mid+1,end);
			return root;
		}

	}

	public static void main(String[] args){
		int nodes[] = {-10,-3,0,5,9};
		BinaryTree tree = new BinaryTree();
/*		Node root = tree.builtTree(nodes);
		System.out.println("Root Node : "+root.data);

		System.out.println("\nPre-Ordered Traversal : ");
		tree.preOrderTraverse(root);
		System.out.println("");
*/
		Node ret = tree.sortToBST(nodes,0,nodes.length-1);
		tree.preOrderTraverse(ret);
		System.out.println("");
	}
}
