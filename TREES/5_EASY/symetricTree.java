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

	public static boolean preOrder(TreeNode root1,TreeNode root2){
		if((root1.left == null && root2.right == null) || (root1.right == null && root2.left == null)) return true;
		
		if(root1.left.data != root2.right.data) return false;

		return (preOrder(root1.left,root2.right) && preOrder(root1.right,root2.left));
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

		if(root == null || root.left.data != root.right.data){
			System.out.println("False");
		}else{
			System.out.println(preOrder(root.left,root.right));
		}
	}
}
