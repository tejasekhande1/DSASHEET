import java.util.*;
class Solution{
	static Stack<Integer> s = new Stack<>();
	public void insertAtBottom(int x){
		if(s.isEmpty()){
			s.push(x);
		}else{
			int top = s.pop();
			insertAtBottom(x);
			s.push(top);
		}
	}
	public void revStack(){
		if(s.size() > 0){
			int x = s.peek();
			s.pop();
			revStack();
			insertAtBottom(x);
		}
	}
	public static void main(String[]args){
		Solution obj = new Solution();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		obj.revStack();
		System.out.println(s);
	}
}
