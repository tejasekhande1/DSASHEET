import java.util.*;
class Solution{
	public boolean ransomeNote(String m,String r){
		int cntArr[] = new int[122-97+1];
		Arrays.fill(cntArr,0);

		for(int i=0 ; i<cntArr.length ; i++){
			System.out.print("|"+cntArr[i]+"|");
		}
		System.out.println();

		for(int i=0 ; i<m.length() ; i++){
			cntArr[m.charAt(i)-97]++;
		}

		for(int i=0 ; i<cntArr.length ; i++){
			System.out.print("|"+cntArr[i]+"|");
		}
		System.out.println();
	
		for(int i=0 ; i<r.length() ; i++){
			if(cntArr[r.charAt(i)-97] <= 0) return false;
			else cntArr[r.charAt(i)-97]--;
		}

		return true;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String m = "ab";
		String r = "az";
		System.out.println("Result : "+s.ransomeNote(m,r));
	}
}
