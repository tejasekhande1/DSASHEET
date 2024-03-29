class Solution{
	public void sortArray(int arr[],int n){
		for(int i=1 ; i<n ; i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {12,11,13,5,6};
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		s.sortArray(arr,arr.length);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
