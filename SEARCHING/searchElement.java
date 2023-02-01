class Solution{
	public int searchElement(int arr[],int key){
		int start = 0;
		int end = arr.length-1;
		while(start <= end){
			int mid = start + (end-start)/2;
			if(arr[mid] == key){
				return mid;
			}else if(arr[mid] > key){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {-10,-5,0,3,7};
		int key = 3;
		int ret = s.searchElement(arr,key);
		System.out.println("Found At Index : "+ret);
	}
}
