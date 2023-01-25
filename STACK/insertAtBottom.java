import java.util.*;
class Solution{
	public void insertAtBottom(Stack <Integer> s1,int data){
		Stack<Integer> s2 = new Stack<>();
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}
	public static void main(String[]args){	
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s1 = new Stack<>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		System.out.println("Stack Before Insert");
		System.out.println(s1);
		System.out.print("Enter Element To Push : ");
		int num = sc.nextInt();
		s.insertAtBottom(s1,num);
		System.out.println("Stack After Insert");
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
	}
}
