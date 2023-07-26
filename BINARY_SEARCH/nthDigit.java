import java.util.*;
class Solution{
	public int findDigit(int n){
		StringBuilder sb = new StringBuilder();
		sb.append("");
		for(int i=1; i<=n ; i++){
			sb.append(i);
		}
	
		char ch = sb.charAt(n-1);
		return (int)(ch-48);
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int n = 3;
		System.out.println(s.findDigit(n));
	}
}

