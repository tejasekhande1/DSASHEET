import java.util.*;
class Solution{
	public int solve(String s1,String s2,int i,int j){
        if(i >= s1.length()) return 0;
        if(j >= s2.length()) return 0;

        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1+solve(s1,s2,i+1,j+1);
        }else{
            ans = Math.max(solve(s1,s2,i,j+1),solve(s1,s2,i+1,j));
        }

        return ans;
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int ret = solve(s1,s2,0,0);
        return ret;
    }
	public static void main(String[]args){
		Solution s = new Solution();
		String s1 = "abcde";
		String s2 = "ace";
		int ret = s.longestCommonSubsequence(s1,s2);
		System.out.println(ret);
	}
}
