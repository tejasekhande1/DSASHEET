import java.util.*;
class Solution{
	public void findEle(int arr[],int n){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0 ; i<n ; i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}

		for(Map.Entry<Integer,Integer> e : hm.entrySet()){
			if(e.getValue() > n/3){
				System.out.println(e.getKey());
			}
		}
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {1,2};
		s.findEle(arr,arr.length);
	}
}
