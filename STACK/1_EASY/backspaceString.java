import java.util.*;
class Solution{
	public boolean backSpace(String s,String t){
		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for(int i=0 ; i<s.length() ; i++){
			if(st1.isEmpty() || s.charAt(i) != '#'){
				st1.push(s.charAt(i));
			}else if(!st1.isEmpty() && s.charAt(i) == '#'){
				st1.pop();
			}
		}
		
		for(int i=0 ; i<t.length() ; i++){
			if(st2.isEmpty() || t.charAt(i) != '#'){
				st2.push(t.charAt(i));
			}else if(!st2.isEmpty() && t.charAt(i) == '#'){
				st2.pop();
			}
		}

		while(!st1.isEmpty()){
			char ch = st1.pop();
			sb1.append(ch);
		}
		
		while(!st2.isEmpty()){
			char ch = st2.pop();
			sb2.append(ch);
		}

		System.out.println(sb1);
		System.out.println(sb2);

		return (sb1.toString().equals(sb2.toString())) ? true : false;
	}
	public static void main(String[]args){
		Solution obj = new Solution();
		String s = "a#b";
		String t = "s";
		System.out.println(obj.backSpace(s,t));
	}
}
