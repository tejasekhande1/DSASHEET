import java.util.*;
class Solution{
	public int uniqueChar(String str){
		int cntArr[] = new int[26];
		Arrays.fill(cntArr,0);
		for(int i=0 ; i<str.length() ; i++){
			cntArr[str.charAt(i)-97]++;
		}

		for(int i=0 ; i<str.length() ; i++){
			if(cntArr[str.charAt(i)-97] == 1){
				return i;
			}
		}

		return -1;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String str = "loveleetcode";
		System.out.println("Unique Character at Index : "+s.uniqueChar(str));
	}
}
