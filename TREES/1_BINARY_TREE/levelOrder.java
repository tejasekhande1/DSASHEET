import java.util.*;
class Solution{
	static List<List<Integer>> ret = new ArrayList<List<Integer>>();
	public static class Node{
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	public static class binaryTree{
		static int idx = -1;
		public static Node builtTree(int arr[]){
			idx++;
			if(arr[idx] == -1){
				return null;
			}

			Node newNode = new Node(arr[idx]);
			newNode.left = builtTree(arr);
			newNode.right = builtTree(arr);
			return newNode;
		}

		public static void inOrderTraverse(Node root){
			if(root == null) return;
			inOrderTraverse(root.left);
			System.out.print(" "+root.val+" ");
			inOrderTraverse(root.right);
		}

		public static void levelOrder(Node root){
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()){
				List<Integer> subRet = new ArrayList<>();
				int s = q.size();
				for(int i=0 ; i<s ; i++){
					if(q.peek().left != null){
						q.add(q.peek().left);
					}
					
					if(q.peek().right != null){
						q.add(q.peek().right);
					}
					subRet.add(q.remove().val);
				}
				ret.add(subRet);
			}	
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		binaryTree t = new binaryTree();
		int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = t.builtTree(arr);
		t.inOrderTraverse(root);
		t.levelOrder(root);
		System.out.println();
		System.out.println(ret);
	}
}
