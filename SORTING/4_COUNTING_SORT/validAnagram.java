import java.util.*;
class Solution{
	public boolean validAnagram(String s1,String s2){
		if(s1.length() != s2.length()) return false;
		int cntArr[] = new int[26];
		for(int i=0 ; i<s1.length() ; i++){
			cntArr[s1.charAt(i)-97]++;
		}
		for(int i=0 ; i<s2.length() ; i++){
			if(cntArr[s2.charAt(i)-97] <= 0) return false;
			else cntArr[s2.charAt(i)-97]--;
		}
		return true;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String s1 = "rat";
		String s2 = "car";
		System.out.println(s.validAnagram(s1,s2));
	}
}
