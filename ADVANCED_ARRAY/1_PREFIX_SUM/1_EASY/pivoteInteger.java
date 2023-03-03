/*
Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.

Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.

Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.
*/
import java.util.*;
class Solution{
	public int pivotInteger(int n){
		if(n == 1){
			return 1;
		}
		int arr[] = new int[n];
		arr[0] = 1;
		int k = 2;
		for(int i=1 ; i<n ; i++){
			arr[i] = arr[i-1] + k;
			k++;
		}

		for(int i=1 ; i<n ; i++){
			if(arr[i] == arr[n-1]-arr[i-1]){
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Pivot Integer : "+s.pivotInteger(n));
	}
}
