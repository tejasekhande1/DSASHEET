class Solution{
	public int first(int arr[],int key){
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end-start)/2;
		int idx = -1;
		while(start <= end){
			if(arr[mid] == key){
				idx = mid;
				end = mid-1;
			}else if(arr[mid] > key){
				end = mid-1;
			}else{
				start = mid+1;
			}
			mid = start + (end-start)/2;
		}
		return idx;
	}

	public int last(int arr[],int key){
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end-start)/2;
		int idx = -1;
		while(start <= end){
			if(arr[mid] == key){
				idx = mid;
				start = mid+1;
			}else if(arr[mid] > key){
				end = mid-1;
			}else{
				start = mid+1;
			}
			mid = start + (end-start)/2;
		}
		return idx;
	}

	public int[] binarySearch(int arr[],int key){
		int ret[] = new int[]{-1,-1};
		int firstOcc = first(arr,key);
		int LastOcc = last(arr,key);
		ret[0] = firstOcc;
		ret[1] = LastOcc;
		return ret;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {5,7,7,8,8,10};
		int key = 7;
		int ret[] = s.binarySearch(arr,key);
		for(int i=0 ; i<ret.length ; i++){
			System.out.print("|"+ret[i]+"|");
		}
		System.out.println();
	}
}
