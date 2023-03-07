import java.util.*;
class Solution{
	public void sort(int arr[],int n){
		for(int i=1 ; i<n ; i++){
			int key = arr[i];
			int j=i-1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j -1;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements of Array : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Before Sorting : ");
		for(int i=0 ; i<n ; i++){
			System.out.print("|"+arr[i]+"|");
		}
		s.sort(arr,n);
		System.out.println("\nArray After Sorting : ");
		for(int i=0 ; i<n ; i++){
			System.out.print("|"+arr[i]+"|");
		}
		System.out.println("");
	}
}
