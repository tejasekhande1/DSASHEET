class Solution{

	public int partition(int arr[],int s,int e){
		int idx = s;
		int pivot = arr[e];
		for(int i=s ; i<e ; i++){
			if(arr[i] <= pivot){
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[e];
		arr[e] = arr[idx];
		arr[idx] = temp;
		return idx;
	}

	public void sortArray(int arr[],int s,int e){
		if(s < e){
			int pivot = partition(arr,s,e);
			sortArray(arr,s,pivot-1);
			sortArray(arr,pivot+1,e);
		}
	}

	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {64,25,12,22,11};

		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		s.sortArray(arr,0,arr.length-1);
		
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
