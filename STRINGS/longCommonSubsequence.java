import java.util.*;
class Solution{

	int ans = 0;
	public int solve(String s1,String s2 , int i,int j){

		if(i == s1.length()) return 0;
		if(j == s2.length()) return 0;

		if(s1.charAt(i) == s2.charAt(j)){
			ans = 1+solve(s1,s2,i+1,j+1);
		}else{
			ans = Math.max(solve(s1,s2,i+1,j),solve(s1,s2,i,j+1));
		}
		return ans;
	}

	public int subSequence(String s1,String s2){
		return solve(s1,s2,0,0);
	}

	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter Second String : ");
		String s2 = sc.nextLine();
		System.out.println("Length of Longest Common Subsequence : "+s.subSequence(s1,s2));
	}
}
