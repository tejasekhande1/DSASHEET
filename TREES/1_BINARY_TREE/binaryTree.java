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

		public static void inOrderTraverse(Node root){
			if(root == null) return;
			inOrderTraverse(root.left);
			System.out.print(" "+root.data+" ");
			inOrderTraverse(root.right);
		}

		public static void postOrderTraverse(Node root){
			if(root == null) return;
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.print(" "+root.data+" ");
		}

		public static void levelOrderTraverse(Node root){
			if(root == null) return;
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);

			while(!q.isEmpty()){
				Node curr = q.remove();
				if(curr == null){
					System.out.println();
					if(q.isEmpty()){
						break;
					}else{
						q.add(null);
					}
				}else{
					System.out.print(" "+curr.data+" ");
					if(curr.left != null) q.add(curr.left);
					if(curr.right != null) q.add(curr.right);
				}
			}
		}

		public static int countNodes(Node root){
			if(root == null) return 0;
			int x = countNodes(root.left);
			int y = countNodes(root.right);
			return x+y+1;
		}
		
		public static int sumOfNodes(Node root){
			if(root == null) return 0;

			int x = sumOfNodes(root.left);
			int y = sumOfNodes(root.right);

			return x + y + root.data;
		}

		public static int heightOfTree(Node root){
			if(root == null) return 0;

			int left = heightOfTree(root.left);
			int right = heightOfTree(root.right);

			return Math.max(left,right) + 1;
		}

		public static int daimeterOfTree(Node root){
			if(root == null) return 0;

			int d1 = daimeterOfTree(root.left);
			int d2 = daimeterOfTree(root.right);
			int d3 = heightOfTree(root.left) + heightOfTree(root.right)+1;

			return Math.max(d1,Math.max(d2,d3));
		}
	}

	public static void main(String[] args){
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.builtTree(nodes);
		System.out.println("Root Node : "+root.data);

		System.out.println("\nPre-Ordered Traversal : ");
		tree.preOrderTraverse(root);

		System.out.println("\n\nIn-Order Traversal : ");
		tree.inOrderTraverse(root);

		System.out.println("\n\nPost-Order Traversal : ");
		tree.postOrderTraverse(root);

		System.out.println("\n\nLevel-Order (BFS) Traversal : ");
		tree.levelOrderTraverse(root);

		System.out.println("\nCount of Nodes : "+tree.countNodes(root));
		
		System.out.println("\nSum of Nodes : "+tree.sumOfNodes(root));
		
		System.out.println("\nHeight of Tree : "+tree.heightOfTree(root));
		
		System.out.println("\nDaimeter of Tree : "+tree.daimeterOfTree(root));
	}
}
