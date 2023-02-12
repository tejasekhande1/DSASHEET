import java.util.*;
class Solution{
/*	public int Triplets(int arr[],int key){
		int cnt = 0;
		for(int i=0 ; i<arr.length ; i++){
			for(int j=i+1 ; j<arr.length ; j++){
				for(int k=i+1 ; k<arr.length ; k++){
					int ans = arr[i]+arr[j]+arr[k];
					if((arr[k]-arr[j] == key) && (arr[j]-arr[i] == key)){
						cnt++;
					}
				}
			}
		}
		return cnt;
	}*/

	public void optTriplet(int arr[],int n){
		Arrays.sort(arr);
		boolean found = false;
		for(int i=0 ; i<n-1 ; i++){
			int l = i+1;
			int r = n-1;
			int x = arr[i];
			while(l<r){
				if(x + arr[l] + arr[r] == 0){
					found = true;
					System.out.print(x+" ");
					System.out.print(arr[l]+" ");
					System.out.println(arr[r]);
				}

				if(x+arr[l]+arr[r] < 0){
					l++;
				}else{
					r--;
				}
			}
		}
	
		if(found == false){
			System.out.println("Triplet Not Found\n");
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {0, -1, 2, -3, 1 };
		s.optTriplet(arr,arr.length);
	//	System.out.println("Triplets Count : "+s.optTriplet(arr,arr.length));
	}
}
