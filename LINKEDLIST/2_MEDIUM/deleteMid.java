import java.util.*;
class Solution{

	Scanner sc = new Scanner(System.in);
	static Node head = null;

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public Node createNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}

	public void addNode(){
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
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

	public void showNodes(){
		Node temp = head;
		while(temp != null){
			System.out.print(" "+temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void deleteNode(){
		
		if(head.next == null) return null;

		Node slow = head;
		Node fast = head;
		Node prev = null;
		while(fast != null && fast.next != null){
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(slow.next != null)
			prev.next = slow.next;
		else
			prev.next = null;
	}

	public static void main(String[] args){
		Solution s = new Solution();
		int n = 4;
		for(int i=1 ; i<=n ; i++){
			s.addNode();
		}
		s.showNodes();
		s.deleteNode();
		s.showNodes();
	}
}
