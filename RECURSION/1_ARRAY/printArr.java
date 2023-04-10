class Solution{
	static int i = 0;
	public void printArray(int arr[],int n){
		if(i == n) return;
		System.out.println(arr[i]);
		i = i+1;
		printArray(arr,n);
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {4,3,5,2,1};
		s.printArray(arr,arr.length);
	}
}
