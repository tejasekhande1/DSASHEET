class Solution{

	public void sortArray(int arr[],int n){
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n-i-1 ; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
