import java.util.Scanner;
class Solution{

	public int insertPosition(int arr[],int n,int key){
		int s = 0;
		int e = arr.length-1;
		int idx = -1;

		if(key > arr[e]){
			return e+1;
		}else if(key < arr[s]){
			return 0;
		}else{
			while(s<e){
				int mid = s+(e-s)/2;
				if(arr[mid] == key){
					return mid;	
				}
		
				if(arr[mid] > key){
					idx = mid;
					e = mid-1;
				}else{
					idx = mid+1;

					s = mid+1;
				}
			}
		}

		return idx;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements in an Array : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Key : ");
		int key = sc.nextInt();
		System.out.println("Index : "+s.insertPosition(arr,n,key));
	}
}
