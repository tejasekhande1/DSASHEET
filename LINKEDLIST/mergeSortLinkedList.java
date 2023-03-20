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

	static ListNode head = null;
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

	public ListNode midNode(ListNode Node){
		if(Node == null || Node.next == null) return Node;
		ListNode slow = Node;
		ListNode fast = Node;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

/*	public ListNode mergeNode(ListNode N1,ListNode N2){
		if(N1 == null || N2 == null){
			return (N1 == null) ? N2 : N1;
		}

		ListNode ans = new ListNode(0);
		ListNode curr = ans;

		while(N1 != null && N2 != null){
			if(N1.val < N2.val){
				curr.next = N1;
				N1 = N1.next;
			}else{
				curr.next = N2;
				N2 = N2.next;

			}
			curr = curr.next;
		}

		if(N1 != null || N2 != null){
			curr.next = (N1 != null) ? N1 : N2;
		}

		return ans.next;
	}*/

	public ListNode mergeNode(ListNode N1,ListNode N2){
	        ListNode result = null;
        	/* Base cases */
        	if (N1 == null)
        	    return N2;
       		 if (N2 == null)
        	    return N1;
 
       		 /* Pick either a or b, and recur */
       		 if (N1.val <= N2.val) {
       		     result = N1;
       		     result.next = mergeNode(N1.next, N2);
       		 }
       		 else {
        	    result = N2;
        	    result.next = mergeNode(N1, N2.next);
       		 }
        	return result;
	}

	public ListNode mergeSort(ListNode Node){
		if(Node == null || Node.next == null) return Node;
		ListNode mid = midNode(Node);
		ListNode newhead = mid.next;
		mid.next = null;

		ListNode left = mergeSort(Node);
		ListNode right = mergeSort(newhead);

		ListNode ret = mergeNode(left,right);
		return ret;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		s.addNode();
		s.addNode();
		s.addNode();
		s.addNode();
		s.addNode();
		s.printNode();
		s.mergeSort(head);
		s.printNode();
	}
}
