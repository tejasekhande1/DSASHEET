import java.util.*;
class Solution{
	public void countSort(int arr[],int size,int pos){
		int cntArr[] = new int[10];
		Arrays.fill(cntArr,0);
		for(int i=0 ; i<size ; i++){
			cntArr[(arr[i]/pos)%10]++;
		}	

		for(int i=1 ; i<10 ; i++){
			cntArr[i] = cntArr[i] + cntArr[i-1];
		}

		int output[] = new int[size];
		for(int i=size-1 ; i>=0 ; i--){
			output[cntArr[(arr[i]/pos)%10]-1] = arr[i];
			cntArr[(arr[i]/pos) % 10]--;
		}

		for(int i=0 ; i<size ; i++){
			arr[i] = output[i];
		}
	}

	public void radixSort(int arr[],int size){
		int max = Arrays.stream(arr).max().getAsInt();
		for(int pos=1 ; max/pos > 0 ; pos = pos*10){
			countSort(arr,size,pos);
		}	
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {7200,12,451,5,1230};
		int n = arr.length;
		for(int i=0 ; i<n ; i++){
			System.out.print("|"+arr[i]);
			if(i == n-1) System.out.print("|\n");
		}
		s.radixSort(arr,n);
		for(int i=0 ; i<n ; i++){
			System.out.print("|"+arr[i]);
			if(i == n-1) System.out.print("|\n");
		}
	}
}
