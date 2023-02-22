// 3SUM CLOSEST

import java.util.*;
class Solution{
	public int threeSum(int arr[],int x){
		int sum = Integer.MAX_VALUE;
		for(int i=0 ; i<arr.length ; i++){
			for(int j=i+1 ; j<arr.length ; j++){
				for(int k=j+1 ; k<arr.length ; k++){
					int curSum = arr[i]+arr[j]+arr[k];
					if(Math.abs(x-sum)  >
					   Math.abs(x - (arr[i]+arr[j]+arr[k]))
					   ){
						sum = (arr[i]+arr[j]+arr[k]);
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
		
		System.out.print("Enter Target : ");
		int t = sc.nextInt();
		System.out.println("Closest Sum : "+s.threeSum(arr,t));
	}
}
