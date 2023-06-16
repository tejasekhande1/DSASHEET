import java.util.*;
class Solution{
	public int countTriplet(int arr[],int n,int sum){
		int cnt = 0;
		Arrays.sort(arr);
		for(int i=0 ; i<n ; i++){
			int s = i+1;
			int e = n-1;
			while(s < e){
				if( (arr[i]+arr[s]+arr[e]) == sum){
					cnt++;
					s++;
					e--;
				}else if(arr[i]+arr[s]+arr[e] > sum){
					e--;
				}else{
					s++;
				}
			}
		}

		return cnt;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {0, -1, 2, -3, 1};
		int sum = -2;
		System.out.println(s.countTriplet(arr,arr.length,sum));
	}
}
