class Solution{
	public int maxArea(int[] arr){
		int n = arr.length;
		int maxArea = 0;
		for(int i=0 ; i<n ; i++){
			int left = i;
			int right = i;
			while(left >= 0 && arr[i] <= arr[left]){
				left--;
			}
			while(right <= n-1 && arr[i] <= arr[right]){
				right++;
			}
			int area = (right-left-1) * arr[i];
			if(area > maxArea){
				maxArea = area;
			}
		}
		return maxArea;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {4,2,1,5,6,3,2,4,2};
		int ret = s.maxArea(arr);
		System.out.println("Maximum Area of Rechangle in Histogram : "+ret);
	}
}
