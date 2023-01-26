import java.util.*;
class Solution{
	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();
/*
	public void sortStack(){
		while(!s1.isEmpty()){
			if(s2.isEmpty()){
				s2.push(s1.pop());
			}else{
				if(s1.peek() > s2.peek()){
					s2.push(s1.pop());
				}else if(s1.peek() < s2.peek()){
					int x = s1.pop();
					while(!s2.isEmpty() && s2.peek() < x){
						s1.push(s2.pop());
					}
					s2.push(x);
				}
			}
		}

		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}
*/

	public void sortStack(){
		while(!s1.isEmpty()){
			int k = s1.pop();
			while(!s2.isEmpty() && s2.peek() < k){
				s1.push(s2.pop());
			}
			s2.push(k);
		}
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}

	public static void main(String[]args){
		Solution obj = new Solution();
		s1.push(5);
		s1.push(1);
		s1.push(3);
		s1.push(2);
		s1.push(6);
		System.out.println(s1);
		obj.sortStack();
		System.out.println(s1);
	}
}
