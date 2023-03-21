import java.util.*;
class Solution{
	public int partition(int arr[],int start,int end){
		int pivot = arr[end];
		int idx = start;
		for(int i=start ; i<end ; i++){
			if(arr[i] < pivot){
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp2 = arr[end];
		arr[end] = arr[idx];
		arr[idx] = temp2;

		return idx;
	}
	public void quickSort(int arr[],int start,int end){
		if(start < end){
			int pivot = partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {5,2,4,3,7,1};
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
		s.quickSort(arr,0,arr.length-1);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
	}
}
