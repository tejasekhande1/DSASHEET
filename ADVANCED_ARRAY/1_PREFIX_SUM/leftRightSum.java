/*Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22]
*/
import java.util.*;
class Solution{
	public int[] leftRightSum(int arr[]){
		int ans[] = new int[arr.length];
		int n = arr.length;
		for(int i=1 ; i<n ; i++){
			arr[i] = arr[i-1]+arr[i];
		}

		for(int i=0 ; i<n ; i++){
			if(i == 0){
				ans[i] = Math.abs(arr[n-1]-arr[i]);
			}else if(i == n-1){
				ans[i] = Math.abs(arr[n-2]);
			}else{
				ans[i] = Math.abs(arr[n-1]-(arr[i]+arr[i-1]));
			}
		}

		for(int i=0 ; i<n ; i++){
			System.out.print("|"+ans[i]+"|");
		}

		System.out.println("");
		return ans;
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
		s.leftRightSum(arr);
	}
}
