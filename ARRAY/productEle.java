import java.util.*;
class Solution{
	public void productEle(int arr[],int n){
		int sum = 1;
		boolean flag = false;
		int idx = -1;
		int  cnt = 0;
		for(int i=0 ; i<=n ; i++){
			if(arr[i] != 0){
				sum = sum*arr[i];
			}else{
				flag = true;
				idx = i;
				cnt++;
			}
		}
	
		if(flag == false){
			for(int i=0 ; i<=n ; i++){
				arr[i] = sum/arr[i];
			}
		}else if(cnt == 1){
			Arrays.fill(arr,0);
			arr[idx] = sum;	
		}else{
			Arrays.fill(arr,0);
		}
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {1,2,3,4};
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
		s.productEle(arr,arr.length-1);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
	}
}
