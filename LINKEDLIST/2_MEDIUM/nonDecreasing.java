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
		System.out.println();

	}

	public int nonDecreasing(){
		int cnt = 0;
		while(true){
			Node prev = head;	
			Node first = head;
			Node second = head.next;
			int flag = 0;
			cnt++;
			while(second != null){
				if(first.data > second.data){
					first.next = second.next;
					first = first.next;
					second = first.next;
					flag = 1;
				}else{
					first = first.next;
					second = second.next;
				}
			}
			if(flag == 0) break;
		}
		return cnt-1;
	}

	public static void main(String[] args){
		Solution s = new Solution();
		int n = 5;
		for(int i=1 ; i<=n ; i++){
			s.addNode();
		}
		s.showNodes();
		System.out.println(s.nonDecreasing());
		s.showNodes();
	}
}
