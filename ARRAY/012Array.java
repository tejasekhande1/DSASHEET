class Solution{
	public static void sortArray(int arr[],int len){
		
		int low = 0;
		int high = len-1;
		int mid = 0;
		int temp = 0;

		while(mid <= high){
			switch(arr[mid]){
				case 0 :
				{
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					low++;
					mid++;
					break;
				}
				case 1 :
					mid++;
					return;
				case 2 :
				{
					temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
					high--;
					break;
				}
			}

		}
	}

	public static void printArray(int arr[],int len){
		for(int i=0 ; i<len ; i++){
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[]args){
		int arr[] = {0,1,2,0,1,1,0,1,2};
		int len = arr.length;
		sortArray(arr,len);
		printArray(arr,len);
	}
}
