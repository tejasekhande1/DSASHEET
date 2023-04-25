import java.util.*;
class Solution{
	public String removePara(String s){
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<s.length() ; i++){
			if(st.isEmpty() && s.charAt(i) == '('){
				st.push(s.charAt(i));
			}else{
				if(s.charAt(i) == '('){
					st.push(s.charAt(i));
					sb.append(s.charAt(i));
				}else{
					st.pop();
					if(!st.isEmpty()) sb.append(s.charAt(i));
				}
			}
		}

		return sb.toString();
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String str = "(())(()())";
		String ret = s.removePara(str);
		System.out.println(ret);
	}		
}
