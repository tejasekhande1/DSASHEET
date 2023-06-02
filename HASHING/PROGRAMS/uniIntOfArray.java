
// UNION AND INTERSECTION OF TWO ARRAYS

import java.util.*;
class Solution{
	public void findUnionIntersection(int arr1[],int arr2[]){
		HashSet<Integer> un = new HashSet<>();
		HashSet<Integer> intr = new HashSet<>();

		for(int i=0 ; i<arr1.length ; i++){
			un.add(arr1[i]);
		}

		for(int i=0 ; i<arr2.length ; i++){
			if(un.contains(arr2[i])){
				intr.add(arr2[i]);
			}else{
				un.add(arr2[i]);
			}
		}

		System.out.println("Union : "+un);
		System.out.println("Intersection : "+intr);
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr1[] = {7,3,9};
		int arr2[] = {6,3,9,2,9,4};
		s.findUnionIntersection(arr1,arr2);
	}
}
