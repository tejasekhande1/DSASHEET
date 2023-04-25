import java.util.*;
class Solution{
	public String makeGood(String s){
		Stack<Character> st = new Stack<>();
		for(int i=s.length()-1 ; i>=0 ; i--){
			if(!st.isEmpty() && (s.charAt(i) == st.peek())){
				st.pop();
			}else{
				st.push(s.charAt(i));
			}
		}

		StringBuilder res = new StringBuilder();
		while(!st.isEmpty()){
			char temp = st.pop();
			res.append(temp);
		}

		return res.toString();
	}

	public static void main(String[]args){
		Solution s = new Solution();
		String str = "abbaca";
		String ret = s.makeGood(str);
		System.out.println(ret);
	}
}
