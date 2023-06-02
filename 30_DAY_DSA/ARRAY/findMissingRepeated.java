import java.util.*;
class Solution{
	public int[] findElement(int arr[]){
		int ret[] = new int[2];	
		Arrays.sort(arr);
		int cnt = 1;
		int idx = -1;
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] == arr[i+1]){
				ret[0] = arr[i];
				idx = i;
				break;
			}
		}
		
		for(int i=0 ; i<arr.length ; i++){
			if(cnt != arr[i]){
				ret[1] = cnt;
				break;
			}
			if(i == idx){
			       	i = i+1;
			}
			cnt++;
		}
		return ret;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,12,13,14,15,16,17,18,19,20,22};
//		int arr[] = {2,2};
//		int arr[] = {3,1,3};
		int ret[] = s.findElement(arr);
		System.out.println(ret[0]+" "+ret[1]);
	}
}
