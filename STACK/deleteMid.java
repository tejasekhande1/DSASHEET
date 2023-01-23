import java.util.Scanner;
class Solution{
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static Node head = null;
	Scanner sc = new Scanner(System.in);

	public void addNode(){
		System.out.println("Enter Data : ");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void deleteMide(){
		if(head == null){
			System.out.println("Invalid Operation");
		}else{
			Node slow = head;
			Node fast = head.next;
			while(slow != null && fast != null){
				slow = slow.next;
				fast = fast.next.next;
			}

			Node temp = head;
			while(temp.next != slow){
				temp = temp.next;
			}

			temp.next = temp.next.next;
		}
	}

	public void printNode(){
		if(head == null){
			System.out.println("LinkedList Empty");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.println("|"+temp.data+"|");
				temp = temp.next;
			}
		}
	}

	public static void main(String[]args){

		Solution s = new Solution();

		s.addNode();
		s.addNode();
		s.addNode();
		s.addNode();
		s.addNode();

		System.out.println("Before Delete Node");
		s.printNode();
		s.deleteMide();
		System.out.println("After Delete Node");
		s.printNode();
	}
}
