/*
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
*/

import java.util.Scanner;
class Solution{
	public static int highAltitude(int arr[]){
		int n = arr.length;
		if(n == 1) return arr[0];
		int newArr[] = new int[n+1];
		newArr[0] = 0;
		for(int i=1 ; i<n ; i++){
			arr[i] = arr[i-1]+arr[i];
		}

		for(int i=1 ; i<n+1 ; i++){
			newArr[i] = arr[i-1];
		}

		int max = newArr[0];
		for(int i=1 ; i<n+1 ; i++){
			if(newArr[i] > max){
				max = newArr[i];
			}
		}

		return max;
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
		System.out.println("High Altitude : "+s.highAltitude(arr));
	}
}
