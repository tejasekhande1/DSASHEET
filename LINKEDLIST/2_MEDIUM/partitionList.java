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
	
	public void printNode(Node newHead){
		Node temp = newHead;
		while(temp != null){
			if(temp.next != null){
				System.out.print("|"+temp.val+"|->");
			}else{
				System.out.println("|"+temp.val+"|");
			}
			temp = temp.next;
		}
	}

	static Node newHead = null;

	public void addLast(Node temp){
		Node newNode = new Node(temp.val);
		if(newHead == null){
			newHead = newNode;
		}else{
			Node demo = newHead;
			while(demo.next != null){
				demo = demo.next;
			}
			demo.next = newNode;
		}
	}

	public void partition(int x){	
		Node temp = head;
		while(temp != null){
			if(temp.val < x){
				addLast(temp);
			}
			temp = temp.next;
		}
		
		Node temp2 = head;
		while(temp2 != null){
			if(temp2.val >= x){
				addLast(temp2);
			}
			temp2 = temp2.next;
		}	
	}

	public void bestApproach(){
        
        	ListNode left = new ListNode(0);
        	ListNode right = new ListNode(0);
        
        	ListNode leftTail = left;
        	ListNode rightTail = right;
        
        	while(head != null){
            	if(head.val < x){
                	leftTail.next = head;
                	leftTail = leftTail.next;
            	}
            	else{
                	rightTail.next = head;
                	rightTail = rightTail.next;
            	}
            	head = head.next;
        }
        
        leftTail.next = right.next;
        rightTail.next = null;
        
        return left.next;
    	}

	}

	public static void main(String[]args){
		Solution s = new Solution();
		for(int i=1 ; i<=2 ; i++){
			s.addNode();
		}
		s.printNode();
		int x = 2;
		s.partition(x);
		head = newHead;
		s.printNode(newHead);
	}
}
