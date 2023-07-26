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

	public static Node createTree(int level){

		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		Node newNode = createNode(data);

		System.out.println("Do you want to add Left Subtree( "+level+" ) ? ");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			newNode.left = createTree(level+1);
		}else{
			newNode.left = null;
		}
		
		System.out.println("Do you want to add right Subtree ? ");
		ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			newNode.right = createTree(level+1);
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
		System.out.println(root.data);
		inOrder(root.right);
	}

	static int max = Integer.MIN_VALUE;
	public static int leftMax1(Node root){
		
		if(root == null) return 0;
		
		if(root.data > max){
			max = root.data;
		}

		leftMax1(root.left);
		leftMax1(root.right);

		return max;
	}

	static int min = Integer.MAX_VALUE;
	public static int rightMin1(Node root){
	
		if(root == null) return 0;

		if(root.data < min){
			min = root.data;
		}

		rightMin1(root.left);
		rightMin1(root.right);

		return min;
	}

	public static boolean validateBST(Node root){
		
		if(root == null) return true;

		int leftMax = leftMax1(root.left);
		int rightMin = rightMin1(root.right);

		if(leftMax < root.data && rightMin > root.data){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args){
		System.out.println("Enter Data For Root Node : ");
		int data = sc.nextInt();

		root = createNode(data);
		System.out.println("Tree Rooted With "+root.data);

		System.out.println("Do you want to add Left Subtree of ROOT? ");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			root.left = createTree(1);
		}else{
			root.left = null;
		}
		
		System.out.println("Do you want to add right Subtree of ROOT? ");
		ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y'){
			root.right = createTree(1);
		}else{
			root.right = null;
		}

		inOrder(root);

		System.out.println();

		System.out.println(validateBST(root));
	}
}
