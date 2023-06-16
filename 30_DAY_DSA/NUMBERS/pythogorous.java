import java.util.*;
class Solution{
	public boolean isPGT(int arr[],int n){
		for(int i=0 ; i<arr.length ; i++){
			arr[i] = arr[i]*arr[i];
		}

		Arrays.sort(arr);

		for(int i=n-1 ; i>=2 ; i--){
			int s = 0;
			int e = i-1;
			while(s < e){
				
				if((arr[s]+arr[e]) == arr[i]){
					return true;
				}
				
				if(arr[s]+arr[e] < arr[i]){
					s++;
				}else{
					e--;
				}
			}
		}

		return false;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {3,2,4,6,5};
		System.out.println(s.isPGT(arr,arr.length));
	}
}
