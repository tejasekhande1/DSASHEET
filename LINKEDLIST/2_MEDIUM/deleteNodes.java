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

	public void delete(Node temp,Node prev,Node temp2){
		if(temp == head){
			head = head.next;
		}else{
			temp = null;
			prev.next = temp2;
		}
	}
	public void deleteNode(){
		Node temp = head;
		Node prev = null;
		while(temp.next != null){
			Node temp2 = temp.next;
			while(temp2 != null){
				if(temp2.val > temp.val){
					delete(temp,prev,temp2);	
					break;
				}
				temp2 = temp2.next;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	public Node suffixMaxApproach(){
		reverseLinkedList();
		Node prev = null;
		Node curr = head;
		int max = head.val;
		while(curr != null){
			max = Math.max(max,curr.val);
			if(max > curr.val){
				prev.next = prev.next.next;
			}else{
				prev = curr;
			}
			curr = curr.next;
		}

		reverseLinkedList();
		return head;
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

	public static void main(String[]args){
		Solution s = new Solution();
		for(int i=1 ; i<=5 ; i++){
			s.addNode();
		}
		s.printNode();
	//	s.deleteNode();
		s.suffixMaxApproach();
		s.printNode();
	}
}
