import java.util.*;
class Solution{
	public int solve(int arr[],int n,int curr,int prev){
		if(curr == n) return 0;

		//include
		int pick = 0;
		if(prev == -1 || arr[curr] > arr[prev]){
			pick = 1 + solve(arr,n,curr+1,curr);
		}

		// exclude
		int notPick = 0 + solve(arr,n,curr+1,prev);

		return Math.max(pick,notPick);
	}
	public int checkSubsequence(int arr[]){
		int curr = 0;
		int prev = -1;
		return solve(arr,arr.length,curr,prev);
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {2,2,2,2,2};
		int ret = s.checkSubsequence(arr);
		System.out.println(ret);
	}
}
