import java.util.*;
class Solution{
	public void solve(String str,String output,int idx,ArrayList<String> ret){
		if(idx >= str.length()){
			ret.add(output);
			return;
		}

		// exclude
		solve(str,output,idx+1,ret);

		//include
		char ch = str.charAt(idx);
		output = output + ch;
		solve(str,output,idx+1,ret);
	}

	public void subSequence(String str){
		ArrayList<String> ret = new ArrayList<>();
		String output = "";
		solve(str,output,0,ret);
		System.out.println(ret);
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String str = "abc";
		s.subSequence(str);
	}
}
