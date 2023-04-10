/*
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19] */

// 2nd APPROACH TREEMAP

import java.util.*;
class Solution{
	public void relSort(int arr1[],int arr2[]){
		int max = Arrays.stream(arr1).max().getAsInt();
		int cntArr[] = new int[max+1];
		
		Arrays.fill(cntArr,0);
		
		for(int i=0 ; i<arr1.length ; i++){
			cntArr[arr1[i]]++;
		}

		int k = 0;
		for(int i=0 ; i<arr2.length ; i++){
			for(int j=1 ; j<=cntArr[arr2[i]] ; j++){
				arr1[k] = arr2[i];
				k++;
			}
			cntArr[arr2[i]] = 0;
		}

		for(int i=0 ; i<cntArr.length ; i++){
			if(cntArr[i] > 0){
				for(int j=1 ; j<=cntArr[i] ; j++){
					arr1[k++] = i;
				}
				cntArr[i] = 0;
			}
		}

		for(int i=0 ; i<k ; i++){
			System.out.println(arr1[i]);
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr1[] = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
		int arr2[] = {2,42,38,0,43,21};
		s.relSort(arr1,arr2);
	}
}
