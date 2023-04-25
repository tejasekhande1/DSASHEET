import java.util.*;
class Solution{
	public String removeDup(String str){
		ArrayList<Character> sb = new ArrayList<>();
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			if(sb.indexOf(ch) == -1){
				sb.add(ch);
			}
		}

		StringBuilder ret = new StringBuilder();
		for(char ch : sb){
			ret.append(ch);
		}

		System.out.println(ret);
		return ret.toString();
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String str = "bcabc";
		String ret = s.removeDup(str);
		System.out.println(ret);
	}
}
