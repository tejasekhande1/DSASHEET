import java.io.*;
import java.util.*;
class Solution{
	public int[] kFrequent(int arr[],int k){

		TreeMap<Integer,Integer> hs = new TreeMap<>();
		HashSet<Integer> ret = new HashSet<Integer>();

		for(int i=0 ; i<arr.length ; i++){
			if(!hs.containsKey(arr[i])){
				hs.put(arr[i],1);
			}else{
				hs.put(arr[i],hs.get(arr[i])+1);
			}
		}

		int ans[] = new int[hs.size()];

		int t = 0;

		for(Map.Entry<Integer,Integer> x : hs.entrySet()){
			ans[t++] = x.getKey();
		}

		Arrays.sort(ans);
		t=0;

		int retArr[] = new int[k];

		if(ans.length == k){
			for(int i=0 ; i<k ; i++){
				System.out.println(ans[i]);
			}
			return ans;
		}

		for(int i=ans.length-1 ; i>=ans.length-k-1;  i--){
			retArr[t++] = ans[i];
		}

		for(int i=0 ; i<k ; i++){
			System.out.println(retArr[i]);
		}

		return ans;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {1,2};
		s.kFrequent(arr,2);
	}
}
