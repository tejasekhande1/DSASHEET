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
		System.out.println(root.data);
		inOrder(root.right);
	}

	public static void printRange(Node root,int l,int h){
		if(root == null) return ;

		if(root.data <= h && root.data >= l){
			printRange(root.left,l,h);
			System.out.print(root.data + " ");
			printRange(root.right,l,h);
		}else if(root.data > h){
			printRange(root.left,l,h);
		}else{
			printRange(root.right,l,h);
		}
	}

	public static int printRangeSum(Node root,int l,int h){
		
		if(root == null) return 0;

		if(root.data <= h && root.data >= l){
			return root.data + printRangeSum(root.left,l,h) + printRangeSum(root.right,l,h);
		}else if(root.data > h){
			return printRangeSum(root.left,l,h);
		}else{
			return printRangeSum(root.right,l,h);
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

		System.out.println("Set Lower Bound : ");
		int low = sc.nextInt();

		System.out.println("Set Upper Bound : ");
		int high = sc.nextInt();

		printRange(root,low,high);
		System.out.println();
		
		int ret = printRangeSum(root,low,high);
		System.out.println(ret);
	}
}
