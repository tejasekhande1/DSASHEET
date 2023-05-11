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

		public static void zigZagLevelOrder(Node root){
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			int lev = -1;
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

			for(int i=0 ; i<ret.size() ; i++){
				if(i % 2 != 0){
					Collections.reverse(ret.get(i));
				}
			}
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		binaryTree t = new binaryTree();
		int arr[] = {3,9,-1,-1,20,15,-1,-1,7,-1,-1};
		Node root = t.builtTree(arr);
		t.inOrderTraverse(root);
		t.zigZagLevelOrder(root);
		System.out.println();
		System.out.println(ret);
	}
}
