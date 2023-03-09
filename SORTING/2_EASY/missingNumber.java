class Solution{
	public int missingNumber(int arr[],int n){
		int ans = 0;
		for(int i=0 ; i<n ; i++){
			ans = ans^arr[i];
			ans = ans^i+1;
		}
		return ans;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {9,6,4,2,3,5,7,0,1};
		int n = arr.length;
		System.out.println("Missing Number : "+s.missingNumber(arr,n));
	}
}
