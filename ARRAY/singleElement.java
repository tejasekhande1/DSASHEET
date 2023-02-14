// arr[] = {2,2,1} -----> 1

import java.util.Scanner;
class Solution{
	public int singleElement(int arr[],int n){
		int ret = 0;
		for(int i=0 ; i<n ; i++){
			ret = ret^arr[i];
		}
		return ret;
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
		System.out.println("Single Element Present in Array : "+s.singleElement(arr,n));
	}
}
