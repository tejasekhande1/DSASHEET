import java.util.*;
class Solution{
	public String[] relRanks(int arr[],int n){
		
		int score[] = new int[n];
		
		for(int i=0 ; i<n ; i++){
			score[i] = arr[i];
		}

		Arrays.sort(score);
		String str[] = new String[n];
		for(int i=0 ; i<n ; i++){
			if(i == arr.length-3){
				str[i]="Gold Medal";
			}else if(i == arr.length-2){
				str[i]="Silver Medal";
			}else if(i == arr.length-1){
				str[i]="Bronze Medal";
			}else{
				str[i] = String.valueOf(n-i);
			}
		}
		
		String ans[] = new String[n];
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n ; j++){
				if(score[i] == arr[j]){
					ans[i] = str[j];
				}
			}
		}

		return ans;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {3,5,4,2,1};
		int n = arr.length;
		s.relRanks(arr,n);
	}
}
