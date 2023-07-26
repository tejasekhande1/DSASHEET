import java.util.*;
class Solution{
	public boolean isContains(int arr[],int k){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0 ; i<arr.length ; i++){
			if(!hm.containsKey(arr[i])){
				hm.put(arr[i],i);
			}else{
				int t = hm.get(arr[i]);
				if(Math.abs(i-t) <= k){
					return true;
				}

				hm.put(arr[i],i);
			}
		}
		return false;
	}

	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {1,0,1,1};
		int k = 1;
		System.out.println(s.isContains(arr,k));
	}
}
