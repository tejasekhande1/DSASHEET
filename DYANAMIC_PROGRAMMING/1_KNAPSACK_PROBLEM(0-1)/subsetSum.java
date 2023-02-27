import java.util.Scanner;
class Solution{
	public boolean subsetSum(int arr[],int n,int sum){
		if(sum == 0) return true;
		if(n == 0 && sum > 0) return false;

		if(arr[n-1] > sum) return subsetSum(arr,n-1,sum);

		return subsetSum(arr,n-1,sum) || subsetSum(arr,n-1,sum-arr[n-1]);
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
		System.out.print("Enter Sum : ");
		int sum = sc.nextInt();
		System.out.println("Result : "+s.subsetSum(arr,n,sum));
	}
}
