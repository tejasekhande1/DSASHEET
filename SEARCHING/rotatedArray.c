#include <stdio.h>
int rotatedArray(int arr[],int size,int key){
	int flag = -1;
	for(int i=0 ; i<size-1 ; i++){
		if(arr[i] > arr[i+1]){
			flag = i+1;
			break;
		}
	}
	if(arr[flag] == key){
		return flag;
	}
	if(arr[size-1] == key){
		return size-1;
	}
	
	int l = size-1;
	if(key > arr[flag] && key < arr[l]){
		int start = flag;
		int end = size-1;
		while(start <= end){
			int mid = start + (end-start)/2;
			if(arr[mid] == key){
				return mid;
			}

			if(arr[mid] > key){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
	}else{
		int start = 0;
		int end = flag-1;
		while(start <= end){
			int mid = start + (end-start)/2;
			if(arr[mid] == key){
				return mid;
			}

			if(arr[mid] > key){
				end = mid-1;
			}else{
				start = mid+1;
			}

		}
	}

	return -1;
}
void main(){
//	int arr[] = {4,5,6,7,0,1,2};
	int arr[] = {1};
	int key = 0;
	int ret = rotatedArray(arr,7,key);
	printf("Index : %d\n",ret);
}
