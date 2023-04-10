class Solution{
	static int i = 1;
	public int retMax(int arr[],int n,int max){
		if(i == n) return max;
		if(arr[i] > max) max = arr[i];
		i = i+1;
		return retMax(arr,n,max);
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {4,3,5,2,1};
		int max = s.retMax(arr,arr.length,arr[0]);
		System.out.println(max);
	}
}
