import java.util.*;
class Solution{
	public int minEle(int arr[]){
	
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] != 0) return arr[i];
		}

		return 0;
	}
	public int setZero(int arr[]){
		boolean flag = true;
		int cnt = 0;
		Arrays.sort(arr);
		while(flag){
			int min = minEle(arr);
			if(min == 0) return cnt;
			for(int i=0 ; i<arr.length ; i++){
				if(arr[i] != 0){
					arr[i] = arr[i]-min;
				}	
			}		
			cnt++;
		}

		return cnt;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {1,5,0,3,5};
		int ret = s.setZero(arr);
		System.out.println("No of Iteration : "+ret);
	}
}
