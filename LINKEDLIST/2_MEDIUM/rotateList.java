import java.util.*;
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
	
	static Node head = null;

	public void addNode(){
		System.out.println("Enter Date : ");
		int val = sc.nextInt();
		Node newNode = new Node(val);
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
			if(temp.next != null){
				System.out.print("|"+temp.val+"|->");
			}else{
				System.out.println("|"+temp.val+"|");
			}
			temp = temp.next;
		}
	}

	
	public void reverseLinkedList(){
		Node temp1 = head;
		Node temp2 = null;
		Node temp3 = null;
		while(temp1 != null){
			temp2 = temp1.next;
			temp1.next = temp3;
			temp3 = temp1;
			temp1 = temp2;
		}
		head = temp3;
	}

	public int countNode(){
		int cnt = 0;
		if(head == null){
		       	return 0;
		}else{
			Node temp = head;
			while(temp != null){
				cnt++;
				temp = temp.next;
			}
			return cnt;
		}
	}

	public void addLast(Node temp){
		if(head == null){
			head = temp; 
		}else{
			Node demo = head;
			while(demo.next != null){
				demo = demo.next;
			}
			demo.next = temp;
			temp.next = null;
		}
	}

	public void rotateList(int k){
		int cnt = countNode();
		int t = k%cnt;
		reverseLinkedList();
		while(t > 0){
			Node temp = head;
			Node newHead = head.next;
			addLast(temp);
			head = newHead;
			t--;
		}
		reverseLinkedList();
	}
	public static void main(String[]args){
		Solution s = new Solution();
		for(int i=1 ; i<=3 ; i++){
			s.addNode();
		}
		s.printNode();
		int k = 4;
		s.rotateList(k);
		s.printNode();
	}
}
