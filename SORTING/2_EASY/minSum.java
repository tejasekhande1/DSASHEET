import java.util.*;
class Solution{
	public int minSum(int n){
		String num = Integer.toString(n);
		System.out.println(num.length());
	
		int arr[] = new int[num.length()];
		int k=0;
		while(n>0){
			int rem = n%10;
			arr[k] = rem;
			k++;
			n=n/10;
		}

		for(int i=0 ; i<num.length() ; i++){
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0 ; i<arr.length ; i++){
			if(i % 2 == 0) sum1 = sum1*10+arr[i];
			else sum2 = sum2*10+arr[i];
		}
		return sum1+sum2;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int n = 687;
		int ret = s.minSum(n);
		System.out.println("Minimum Sum : "+ret);
	}
}
