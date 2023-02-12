import java.util.Scanner;
class Solution{
	public int minRotate(int arr[],int n){
		for(int i=0 ; i<n-1 ; i++){
			if(arr[i] > arr[i+1]){
				return arr[i+1];
			}
		}
		return -1;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Minimum Element in Rotate Array : "+s.minRotate(arr,n));
	}
}
