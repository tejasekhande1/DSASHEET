class Solution{

	public void sortArray(int arr[],int n){
		for(int i=0 ; i<n ; i++){
			int min = i;
			for(int j=i+1 ; j<n ; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {64,25,12,22,11};

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
