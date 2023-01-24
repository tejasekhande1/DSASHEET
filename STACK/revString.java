import java.util.*;
class Solution{
	public void revString(String str){
		Stack <String> st = new Stack<>();
		String temp = "";
		for(int i=0 ; i<str.length() ; i++){
			if(str.charAt(i) == ' '){
				st.push(temp);
				temp="";
			}else{
				temp = temp + str.charAt(i);
			}
		}

		st.push(temp);

		while(!st.isEmpty()){
			temp = st.peek();
			System.out.print(temp+" ");
			st.pop();
		}
		System.out.println("");
	}

	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		s.revString(str);
	}
}
