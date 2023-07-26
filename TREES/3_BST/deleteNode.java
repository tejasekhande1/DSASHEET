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

	public static void inOrder(Node root){

		if(root == null){
			return ;
		}

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public static Node findInsuccessorNode(Node root){
		while(root.left != null){
			root = root.left;
		}
		return root;
	}

	public static Node deleteNode(Node root,int val){

		if(root.data > val){
			root.left = deleteNode(root.left,val);
		}else if(root.data < val){
			root.right = deleteNode(root.right,val);
		}else{
			if(root.left == null && root.right == null){
			       	return null;
			}

			if(root.left == null){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}

			Node IS = findInsuccessorNode(root.right);
		       	root.data = IS.data;
	       		root.right = deleteNode(root.right,IS.data);	       
		}

		return root;
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

		inOrder(root);
		System.out.println();

		System.out.println("Enter Key : ");
		int key = sc.nextInt();
		deleteNode(root,key);
		
		inOrder(root);
		System.out.println();
	}
}
