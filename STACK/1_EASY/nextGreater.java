import java.util.*;
class Solution{
	public int[] nextGreater(int nums1[],int nums2[]){
		Stack<Integer> st = new Stack<>();
		Map<Integer,Integer> mp = new HashMap<>();

		for(int i=nums2.length-1 ; i>=0 ; i--){
			int ele = nums2[i];
			while(!st.isEmpty() && st.peek() < ele){
				st.pop();
			}

			int res = (st.isEmpty()) ? -1 : st.peek();
			mp.put(ele,res);
			st.push(ele);
		}

		for(int i=0 ; i<nums1.length ; i++){
			nums1[i] = mp.get(nums1[i]);
			System.out.println(nums1[i]);
		}

		return nums1;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int nums1[] = {4,1,2};
		int nums2[] = {1,3,4,2};
		s.nextGreater(nums1,nums2);
	}
}
