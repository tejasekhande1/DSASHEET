import java.util.*;
class Solution{
	static Scanner sc = new Scanner(System.in);
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	static Node head = null;
	
	public Node createNode(){
		System.out.print("Enter Data : ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		return newNode;
	}

	public void addLast(){
		Node newNode = createNode();
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
		if(head == null){
			System.out.println("LinkedList is Empty");
			return;
		}else{
			Node temp = head;
			while(temp != null){
				System.out.print("|"+temp.data+"|");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public void reverseList(int k){
	
	}

	public static void main(String[] args){
		
		Solution s = new Solution();
		
		for(int i=0 ; i<5 ; i++){
			s.addLast();
		}

		s.printNode();

		System.out.println("Enter Value of K : ");
		int k = sc.nextInt();

		s.reverseList(k);
	}
}
