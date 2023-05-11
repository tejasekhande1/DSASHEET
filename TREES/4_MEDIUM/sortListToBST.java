import java.util.*;
class Solution{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	static Node head = null;

	public static Node createNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}

	public static void addNode(int data){
		Node newNode = createNode(data);
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void printNode(){
		Node temp = head;
		while(temp != null){
			System.out.print(" "+temp.data+" ");
			temp = temp.next;
		}
	}

	public Node findMid(Node head1){
		Node slow = head1;
		Node fast = head1;
		Node prev = head1;
		while(fast != null && fast.next != null){
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		if(prev != null)
			prev.next = null;
		return slow;
	}

	public Node constructBST(Node head){
		if(head == null){
			return null;
		}

		Node root = findMid(head);
		root.left = constructBST(head);
		root.right = constructBST(root.next);
		return root;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<5 ; i++){
			System.out.println("Enter Data : ");
			int data = sc.nextInt();
			addNode(data);
		}

		s.printNode();
		System.out.println();

		Node ret = s.constructBST(head);
	}
}
