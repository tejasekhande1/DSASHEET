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
	static Node retNodes = null;

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

	public void addLast(Node newNode){
		Node myNode = newNode;
		if(retNodes == null){
			retNodes = myNode;
			myNode.next = null;
		}else{
			Node temp = retNodes;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = myNode;
			myNode.next = null;
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
	
	Stack<Node> st = new Stack<>();
	public void reorderList(){
		Node temp = head;
		int cnt = 0;
		while(temp != null){
			st.push(temp);
			temp = temp.next;
			cnt++;
		}

		System.out.println(st);
		temp = head;
		int flag = 0;
		int cond = cnt/2;
		while(cond > 0){
			if(flag == 0){
				flag = 1;
				addLast(temp);
				temp = temp.next;
				cond--;
			}else{
				flag = 0;
				Node lastNode = st.pop();
				addLast(lastNode);
			}
		} 

		head = retNodes;
	}

	public static void main(String[]args){
	
		Solution s = new Solution();
	
		for(int i=1 ; i<=5 ; i++){
			s.addNode();
		}

		s.printNode();
		s.reorderList();
	//	s.printNode();
	}
}
