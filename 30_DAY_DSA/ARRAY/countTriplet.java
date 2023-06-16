
// COUNT TRIPLETS WITH SUM IS LESS THAN K

import java.util.*;
class Solution{
	public int countTriplet(int arr[],int n,int sum){
		int cnt = 0;
		Arrays.sort(arr);
		for(int i=0 ; i<n-2 ; i++){
			int s = i+1;
			int e = n-1;
			while(s < e){
				if(arr[i]+arr[s]+arr[e] >= sum){
					e--;
				}else{
					cnt += (e-s);
					s++;
				}
			}
		}

		return cnt;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {5, 1, 3, 4, 7};
		int sum = 12;
		System.out.println(s.countTriplet(arr,arr.length,sum));
	}
}
