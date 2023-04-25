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

	public void swapNodes(){
		Node temp = head;
		int cnt = 0;
		Node prev = null;
		while(temp != null && temp.next != null){
			Node tNext = temp.next;
			temp.next = temp.next.next;
			tNext.next = temp;
			
			if(cnt == 0)
				head = tNext;
			else
				prev.next = tNext;
			
			cnt++;
			prev = temp;
			temp = temp.next;
		}
	}

	public static void main(String[]args){
		Solution s = new Solution();
		for(int i=1 ; i<=1 ; i++){
			s.addNode();
		}
		s.printNode();
		s.swapNodes();
		s.printNode();
	}
}
