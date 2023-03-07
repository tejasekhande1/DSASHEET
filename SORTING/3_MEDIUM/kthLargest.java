
// USING QUICKSORT

class Solution{
	public int partition(int arr[],int start,int end){
		int idx = start;
		int pivot = arr[end];
		for(int i=start ; i<end ; i++){
			if(arr[i] < pivot){
				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx] = t;
				idx++;
			}
		}

		int t = arr[end];
		arr[end] = arr[idx];
		arr[idx] = t;

		return idx;
	}

	public void sortArray(int arr[],int s,int e){
		if(s<e){
			int pivot = partition(arr,s,e);
			sortArray(arr,s,pivot-1);
			sortArray(arr,pivot+1,e);
		}
	}

	public int kthLarge(int arr[],int k){
		return arr[arr.length-k];
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {3,2,3,1,2,4,5,5,6};
		s.sortArray(arr,0,arr.length-1);
		System.out.println(s.kthLarge(arr,1));
	}
}
