import java.util.*;
class Solution{
	public boolean fourSum(int arr[],int n,int sum){
		if(n < 4) return false;
		Arrays.sort(arr);
		for(int i=0 ; i<n-3 ; i++){
			for(int j=i+1 ; j<n-2 ; j++){
				int r = n-1;
				int l = j+1;
				while(l<r){
					if(arr[i]+arr[j]+arr[r]+arr[l] == sum) return true;
					else if(arr[i]+arr[j]+arr[r]+arr[l] > sum) r--;
					else j++;
				}
			}
		}
		return false;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {1,4,45,6,10,12};
		int n = arr.length;
		int k = 21;
		System.out.println(s.fourSum(arr,n,k));
	}
}
