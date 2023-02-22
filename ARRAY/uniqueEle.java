
// FIND UNIQUE ELEMENT IN ARRAY WHICH CONTAINS A OTHERE ELEMENTS K TIMES

import java.util.*;
class Solution{
	public int uniqueElement(int arr[]){
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i=0 ; i<arr.length ; i++){
			if(mp.containsKey(arr[i])){
				mp.put(arr[i], mp.get(arr[i]) + 1 );
			}else{
				mp.put(arr[i],1);
			}
		}	
		for(Map.Entry<Integer,Integer> m : mp.entrySet()){
			if(m.getValue() != 3){
				return m.getKey();
			}
		}
		return -1;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements in an Array : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(s.uniqueElement(arr));
	}
}
