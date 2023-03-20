import java.util.*;
class Solution{
	public String Large(int arr[],int n){
		int mid = (n-1)/2;
		String ret = "";
		for(int i=n-1 ; i>=mid ; i--){
			ret = ret + arr[i];
		}

		for(int i=0 ; i<mid ; i++){
			ret = ret + arr[i];
		} 

		return ret;
	}

	public String findLarge(int arr[],int n){
		for(int i=0 ; i<n ; i++){
			String sum1 = "",sum2 = "";
			for(int j=i+1 ; j<n ; j++){
				sum1 = sum1 + arr[i] + arr[j];
				sum2 = sum2 + arr[j] + arr[i];

				if(Integer.parseInt(sum2) > Integer.parseInt(sum1)){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		StringBuilder ret = new StringBuilder();
		for(int i=0 ; i<n ; i++){
			ret.append(arr[i]);
		}

		return ret.toString();
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {3,30,34,5,9};
		int n = 5;
		String ret = s.findLarge(arr,n);
		System.out.println("Largest Number : "+ret);
	}
}
