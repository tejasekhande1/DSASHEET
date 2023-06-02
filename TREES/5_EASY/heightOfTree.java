import java.util.*;
class Solution{
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data = data;
		}
	}

	public static TreeNode addNode(int level){

		level++;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		TreeNode newNode = new TreeNode(data);
		
		System.out.print("Do you want to add Left SubTree at Level "+level+" : ");
		char ch = sc.next().charAt(0);

		if(ch == 'y' || ch == 'Y'){
			newNode.left = addNode(level);
		}else{
			newNode.left = null;
		}
		
		System.out.print("Do you want to add Right SubTree at Level "+level+" : ");
		ch = sc.next().charAt(0);

		if(ch == 'y' || ch == 'Y'){
			newNode.right = addNode(level);
		}else{
			newNode.right = null;
		}

		return newNode;
	}

	public static void preOrder(TreeNode root){
		if(root == null) return ;
		System.out.print(" "+root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static int heightOfTree(TreeNode root){
		if(root == null){
			return 0;
		}

		int l = heightOfTree(root.left);
		int r = heightOfTree(root.right);

		return Math.max(l,r)+1;
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		TreeNode root = new TreeNode(data);
		System.out.println("Tree Rooted With : "+root.data);

		System.out.print("Do you want to add Left SubTree ? ");
		char ch = sc.next().charAt(0);

		if(ch == 'y' || ch == 'Y'){
			root.left = addNode(0);
		}else{
			root.left = null;
		}
		
		System.out.print("Do you want to add Right SubTree ? ");
		ch = sc.next().charAt(0);

		if(ch == 'y' || ch == 'Y'){
			root.right = addNode(0);
		}else{
			root.right = null;
		}

		preOrder(root);
		System.out.println();

		System.out.println(heightOfTree(root));
	}
}
