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

	ArrayList <Integer> arr = new ArrayList<>();
	
	public void inOrder(Node root,int k){
		if(root == null){
			return ;
		}

		inOrder(root.left,k);
		arr.add(root.data);
		inOrder(root.right,k);
	}

	public int kthSmallest(Node root,int k){
		inOrder(root,k);
		return arr.get(k-1);
	}

	public static void main(String[] args){

		Solution s = new Solution();

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

		System.out.println("Enter Kth Element : ");
		int k = sc.nextInt();
		System.out.println(s.kthSmallest(root,k));
	}
}
