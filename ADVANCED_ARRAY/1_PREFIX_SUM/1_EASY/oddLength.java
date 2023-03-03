/*
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
*/

import java.util.Scanner;
class Solution{
	public int oddLength(int arr[]){
		int n = arr.length;
	
		if(n == 1) return arr[0];
	
		for(int i=1 ; i<n ; i++){
			arr[i] = arr[i-1]+arr[i];
		}

		if(n == 2) return arr[n-1];

		int sum = arr[n-1];

		if(n >= 3){
			for(int j=2 ; j<n ; j=j+2){
				for(int i=j ; i<n ; i++){
					if(i == j){
						sum = sum + arr[i];
					}else{
						sum = sum + (arr[i]-arr[i-(j+1)]);
					}
				}
			}
		}

		return sum;
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
		System.out.println("Sum of Odd Length Array : "+s.oddLength(arr));
	}
}
