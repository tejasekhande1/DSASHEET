// INTERSECTION OF ARRAY

import java.util.*;
class Solution{
	public int[] interSection(int nums1[],int nums2[]){
		Set<Integer> set1 = new HashSet<>();
       
       		for (int i = 0 ; i<nums1.length ; i++) {
            		set1.add(nums1[i]);
        	}
       
        	Set<Integer> set2 = new HashSet<>();
       
       		for (int i=0 ; i<nums2.length ; i++) {
            		set2.add(nums2[i]);
        	}
       
        	Set<Integer> finalSet = new HashSet<>();
       
       		for (Integer var : set1) {
            		if (set2.contains(var)) {
                		finalSet.add(var);
           	}
        }
       
        int[] arr = new int[finalSet.size()];
        int idx = 0;
       
        for (Integer value : finalSet) {
            arr[idx] = value;
            idx++;
        }

		return arr;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int nums1[] = {2,2};
		int nums2[] = {1,2,2,1};
		s.interSection(nums1,nums2);
	}
}
