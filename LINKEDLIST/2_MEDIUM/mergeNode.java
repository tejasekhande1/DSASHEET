import java.util.Scanner;
class Solution{
	Scanner sc = new Scanner(System.in);
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	
	Node head = null;
	public void addNode(){
		System.out.println("Enter Data : ");
		int x = sc.nextInt(); 
		Node newNode = new Node(x);

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
			System.out.print("|"+temp.val+"|");
			temp = temp.next;
		}
		System.out.println();
	}

	Node newHead = null;
	public void createNode(int val){
		Node newNode = new Node(val);	
		if(newHead == null){
			newHead = newNode;
		}else{
			Node temp = newHead;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void mergeNode(){
		Node temp = head.next;

		int sum = 0;

		while(temp != null){
			if(temp.val == 0){
				createNode(sum);
				sum = 0;
			}else{
				sum = sum + temp.val;
			}
			temp = temp.next;
		}
	}
	
	public void printNodes(){
		Node temp = newHead;
		while(temp != null){
			System.out.print("|"+temp.val+"|");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[]args){
		Solution s = new Solution();
		for(int i=1 ; i<=8 ; i++){
			s.addNode();
		}	
		s.printNode();
		s.mergeNode();
		s.printNodes();
	}
}
