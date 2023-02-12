// [1,7,3,6,5,6] ---> 3 INDEX arr[0]+arr[1]+arr[2] = 11 and arr[4]+arr[5] = 11

import java.util.Scanner;
class Solution{
	public int pivotIndex(int arr[],int n){
		for(int i=0 ; i<n ; i++){
			int sum1 = 0,sum2 = 0;
			for(int j=0 ; j<n ; j++){
				if(j < i){
					sum1 += arr[j];
				}

				if(j > i){
					sum2 += arr[j];
				}
			}
			if(sum1 == sum2){
				return i;
			}
		}

		return -1;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements in an Array : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Pivot Index : "+s.pivotIndex(arr,n));
	}
}
