import java.util.*;
class Solution{
	public int evalPostfix(String str){
		Stack <Integer> st = new Stack<>();
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				st.push(ch-'0');
			}else{
				int val1 = st.pop();
				int val2 = st.pop();

				switch(ch){
					case '+' :
						st.push(val2+val1);
						break;
					case '-' :
						st.push(val2-val1);
						break;
					case '*' :
						st.push(val2*val1);
						break;
					case '/' :
						st.push(val2/val1);
						break;
				}
			}	
		}

		return st.peek();
	}
	public static void main(String[]args){
		Solution s = new Solution();
		System.out.println("Evaluation : " + s.evalPostfix("231*+9-23+"));
	}
}
