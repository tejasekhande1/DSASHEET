import java.util.*;
class Solution{
	public List<Integer> majorityElements(int arr[]){
		List <Integer> ret = new ArrayList<>();
		Arrays.sort(arr);
		int n = arr.length/3;
		int cnt = 1;
		int ele = arr[0];
		for(int i=1 ; i<arr.length ; i++){
			if(ele == arr[i]){
				cnt++;
			}else{
				if(cnt > n){
					ret.add(ele);	
				}
				cnt = 1;
				ele = arr[i];
			}
		}

		if(cnt > n){
			ret.add(ele);
		}
		
		System.out.println(ret);

		return ret;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {3,2,3};
		s.majorityElements(arr);
	}
}
