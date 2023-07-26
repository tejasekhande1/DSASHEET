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

	public static void buildBST(Node root,int data){

		if(root.data > data && root.left == null){
			root.left = createNode(data);
		}

		if(root.data < data && root.right == null){
			root.right = createNode(data);
		}

		if(root.data > data){
			buildBST(root.left,data);
		}else if(root.data < data){
			buildBST(root.right,data);
		}
	}

	public static void inOrder(Node root){

		if(root == null){
			return ;
		}

		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	public static void main(String[] args){
		int values[] = {5,1,3,4,2,7};
		root = createNode(values[0]);
		for(int i=1 ; i<values.length ; i++){
			buildBST(root,values[i]);
		}
		inOrder(root);
	}
}
