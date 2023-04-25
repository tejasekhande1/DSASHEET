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

	public boolean subSequence(String str,String sub){
		ArrayList<String> ret = new ArrayList<>();
		String output = "";
		solve(str,output,0,ret);
		System.out.println(ret);
		int res = ret.indexOf(str);
		if(res != -1) return true;
		else return false;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String str = "abc";
		String sub = "ahbgdc";
		System.out.println(s.subSequence(str,sub));
	}
}
