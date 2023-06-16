/*Given a sorted array of positive integers. 
 *Your task is to rearrange the array elements alternatively i.e first element should be max value,
 second should be min value, third should be second max, fourth should be second min and so on.*/

import java.util.*;
class Solution{
	public void reArrange(int arr[],int n){
		int temp[] = arr.clone();
		int t = 0;
		for(int i=n-1 ; i>=0 && t<n; i--){
			arr[t] = temp[i];
			t = t+2;
		}

		t = 1;
		for(int i=0 ; i<n && t<n ; i++){
			arr[t] = temp[i];
			t = t+2;
		}

		for(int i=0 ; i<n ; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		Solution s = new Solution();
		//int arr[] = {1,2,3,4,5,6};
		int arr[]={10,20,30,40,50,60,70,80,90,100,110};
		s.reArrange(arr,arr.length);
	}
}
