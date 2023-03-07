import java.util.*;
class Solution{
	public int findElement(int arr[]){
		HashMap<Integer,Integer> map = new HashMap<>();
		int n = arr.length;
		for(int i=0 ; i<arr.length ; i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i],1);
			}else{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}

		int max = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()){
            		if(e.getValue() > n/2){
				max = e.getKey();
				break;	
			}
		}
	
		return max;
	}

	public int sortElement(int arr[]){
		Arrays.sort(arr);
		int ele = arr[0];
		int cnt = 1;
		for(int i=1 ; i<arr.length ; i++){
			if(arr[i] == ele){
				cnt++;
				if(arr.length/2 < cnt){
					ele = arr[i];
					break;
				}
			}else{
				cnt = 1;
				ele = arr[i];
			}
		}

		return ele;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {3,2,3};
		System.out.println(s.sortElement(arr));
	}
}
