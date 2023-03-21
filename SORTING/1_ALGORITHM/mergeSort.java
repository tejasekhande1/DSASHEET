class Solution{
	public void merge(int arr[],int start,int mid,int end){
		int x = mid-start+1;
		int y = end-mid;
		int newArr1[] = new int[x];
		int newArr2[] = new int[y];

		for(int i=0 ; i<x ; i++){
			newArr1[i] = arr[start+i];
		}
		
		for(int i=0 ; i<y ; i++){
			newArr2[i] = arr[mid+1+i];
		}

		int i=0,j=0,t=start;
		while(i<x && j<y){
			if(newArr1[i] < newArr2[j]){
				arr[t] = newArr1[i];
				i++;
			}else{
				arr[t] = newArr2[j];
				j++;
			}
			t++;
		}

		while(i < x){
				arr[t] = newArr1[i];
				i++;
				t++;
		}
		
		while(j < y){
				arr[t] = newArr2[j];
				j++;
				t++;
		}
	}

	public void mergeSort(int arr[],int start,int end){
		if(start < end){
			int mid = (start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {5,2,4,3,7,1};
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
		s.mergeSort(arr,0,arr.length-1);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
	}
}
