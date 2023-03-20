import java.util.*;
class Solution{
	Scanner sc = new Scanner(System.in);
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
			this.next = null;
		}
	}

	ListNode head = null;
	public void addNode(){
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		ListNode Node = new ListNode(data);
		if(head == null){
			head = Node;
		}else{
			ListNode temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = Node;
		}

	}

	public void printNode(){
		ListNode temp = head;
		while(temp != null){
			if(temp.next != null)
				System.out.print("|"+temp.val+"|->");
			else
				System.out.print("|"+temp.val+"|\n");
			temp = temp.next;
		}
	}

	public void sort(){
		ListNode temp1 = head.next;
		while(temp1 != null){
			ListNode temp2 = head;
			while(temp2 != temp1){
				if(temp2.val > temp1.val){
					int v = temp1.val;
					temp1.val = temp2.val;
					temp2.val = v;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}

	public static void main(String[]args){
		Solution s = new Solution();
		s.addNode();
		s.addNode();
		s.addNode();
		s.addNode();
		s.addNode();
		s.sort();
		s.printNode();
	}
}
