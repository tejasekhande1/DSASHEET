import java.util.*;
class Solution{
	public int luckyNumber(int arr[]){
		HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0 ; i<arr.length ; i++){
			hm.put(arr[i],(hm.getOrDefault(arr[i],0)+1));
		}

		int ret = -1;

		for(Map.Entry<Integer,Integer> e : hm.entrySet()){
			if(e.getKey() == e.getValue()){
				if( ret < e.getValue()){
					ret = e.getValue();
				}
			}
		}

		return ret;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {1,2,2,3,3,3};
		int ret = s.luckyNumber(arr);
		System.out.println(ret);
	}
}
