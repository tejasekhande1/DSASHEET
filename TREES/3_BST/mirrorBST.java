import java.util.*;
class Solution{
	
	static Scanner sc = new Scanner(System.in);

	public static class Node{
		Node left;
		int data;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static Node root = null;
	public static Node newRoot = null;

	public static Node createNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}

	public static Node createTree(){

		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		Node newNode = createNode(data);

		System.out.println("Do you want to add Left Subtree ? ");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			newNode.left = createTree();
		}else{
			newNode.left = null;
		}
		
		System.out.println("Do you want to add right Subtree ? ");
		ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			newNode.right = createTree();
		}else{
			newNode.right = null;
		}
		
		return newNode;
	}

	public static void mirrorBST(Node root1,Node root2){
	
		if(root1 == null && root2 == null){
			return ;
		}

		Node temp = root1.right;
		root1.right = root2.left;
		root2.left = temp;

		mirrorBST(root1.left,root1.left);
		mirrorBST(root2.right,root2.right);
	}

	public static void inOrder(Node root){

		if(root == null){
			return ;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args){
		System.out.println("Enter Data For Root Node : ");
		int data = sc.nextInt();
		root = createNode(data);
		System.out.println("Tree Rooted With "+root.data);

		System.out.println("Do you want to add Left Subtree of ROOT? ");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			root.left = createTree();
		}else{
			root.left = null;
		}
		
		System.out.println("Do you want to add right Subtree of ROOT? ");
		ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			root.right = createTree();
		}else{
			root.right = null;
		}

		newRoot = root;
		inOrder(root);
		System.out.println();

		mirrorBST(newRoot,newRoot);
		inOrder(newRoot);
		System.out.println();
	}
}
