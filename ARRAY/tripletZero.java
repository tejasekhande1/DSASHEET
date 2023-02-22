
// RETURN TRUE IF ANY TRIPLET'S SUM IS ZERO

import java.util.Scanner;
class Solution{
	public boolean tripletZero(int arr[]){
		for(int i=0 ; i<arr.length ; i++){
			for(int j=i+1 ; j<arr.length ; j++){
				for(int k=j+1 ; k<arr.length ; k++){
					if(arr[i]+arr[j]+arr[k] == 0){
						return true;
					}
				}
			}
		}
		return false;
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
		System.out.println("Result : "+s.tripletZero(arr));
	}
}
