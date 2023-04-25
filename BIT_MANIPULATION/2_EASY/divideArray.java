import java.util.*;
class Solution{
    	public boolean divideArray(int[] nums){
       		Arrays.sort(nums);
        	for(int i=0 ; i<nums.length-1 ; i = i+2){
            		if((nums[i]^nums[i+1]) != 0) return false;
        	}
        	return true;
    	}
    	
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {3,2,3,2,2,2};
		System.out.println(s.divideArray(arr));
   	}
}
