import java.util.*;
class Solution{
	public int findAverage(int arr[]){
		Arrays.sort(arr);
		int end = arr.length-1;
		double retArr[] = new double[arr.length/2];
	
		for(int i=0 ; i<=(arr.length-1)/2 ; i++){
			retArr[i] = (double)(arr[i]+arr[end])/2;
			end--;
		}
	
		Arrays.sort(retArr);
		for(int i=0 ; i<retArr.length ; i++){
			System.out.println(retArr[i]);
		}

		int cnt=1;
		for(int i=1 ; i<retArr.length ; i++){
			if(retArr[i] != retArr[i-1]) cnt++;
		}

		return cnt;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {15,77,97,26,53,41,26,13,12,18,17,42,13,33,34,70,48,65,62,78,33,60,96,53,23,14,60,70,57,41,29,12,79,65,52,30};
		System.out.println(s.findAverage(arr));
	}
}
