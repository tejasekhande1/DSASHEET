import java.util.*;
class Solution{
	public int bitFlip(int s,int e){
		int n = Math.max(s,e);
		int cnt = 0;
		while(n > 0){
			if((s & 1) != (e & 1)){
				cnt++;
			}
			s = s >> 1;
			e = e >> 1;
			n = n >> 1;
		}
		return cnt;
	}
	public static void main(String[]args){
		Solution s1 = new Solution();
		int s = 3;
		int e = 4;
		int ret = s1.bitFlip(s,e);
		System.out.println(ret);
	}
}
