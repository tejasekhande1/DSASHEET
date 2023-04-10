import java.io.*;
import java.util.*;
class Solution{
	public String freqSort(String str){
		String ret = "";
		int cntArr[] = new int[128];
		Arrays.fill(cntArr,0);
		for(int i=0 ; i<str.length() ; i++){
			cntArr[str.charAt(i)]++;
		}
		
		for(int j=0 ; j<str.length() ; j++){
			int max = 0;
			int idx = 0;
			for(int i=127 ; i>=0 ; i--){
				if(cntArr[i] > max){
					max = cntArr[i];
					idx = i;
				}
			}
			while(max > 0){
				ret = ret + (char)(idx);
				max--;
				cntArr[idx]--;
			}
		}

		return ret;
	}
	public static void main(String[]args) throws IOException{
		Solution s = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		String ret = s.freqSort(str);
		System.out.println(ret);
	}
}
