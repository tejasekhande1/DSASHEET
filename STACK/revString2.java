import java.util.*;
class Solution{
	public void revString(String str){
		Stack <String> st = new Stack<>();
		String[] token = str.split(" ");
		for(int i=0 ; i<token.length ; i++){
			st.push(token[i]);
		}

		while(!st.isEmpty()){
			System.out.print(st.peek() + " ");
			st.pop();
		}
		System.out.println();
	}

	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		s.revString(str);
	}
}
