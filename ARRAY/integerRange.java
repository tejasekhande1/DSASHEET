import java.util.*;
class Solution{
	public boolean integerRange(int arr[][],int start,int end){
		int cnt = 0;
		for(int i=start ; i<=end ; i++){
			for(int j=0 ; j<arr.length ; j++){
				int flag = 0;
				for(int k=0 ; k<arr[0].length ; k++){
					if(i <= arr[j][k]){
						cnt++;
						flag = 1;
						break;
					}
				}
				if(flag == 1) break;
			}
		}

		if(cnt == (end-start)+1) return true;
		else return false;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[][] = {{50,50}};
		int start = 1;
		int end = 50;
		System.out.println(s.integerRange(arr,start,end));
	}
}
