import java.util.*;
class Solution{
	public int count(int arr[]){
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0 ; i<arr.length ; i++){
			hs.add(arr[i]);
		}

		return hs.size();
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {4,3,2,5,6,7,3,4,2,1};
		System.out.println(s.count(arr));
	}
}
