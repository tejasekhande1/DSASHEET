import java.util.Scanner;
class Solution{
	public int midIndex(int arr[]){
		int n = arr.length;
		if(n == 2){
			if(arr[n-1] == 0) return 0;
		}
		for(int i=1  ; i<n ; i++){
			arr[i] = arr[i-1]+arr[i];
		}

		int s=0,e=0;
		for(int i=0 ; i<n ; i++){
			if(i == 0){
				s = 0;
				if(s == arr[n-1]) return i;
			}else if(i == n-1){
				e = 0;
				if(e == arr[i-1]) return i;
			}else{
				s = arr[i-1];
				e = arr[n-1];
				if(arr[i] == e-s) return i;
			}
		}
		return -1;
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
		System.out.println("Middle Index : "+s.midIndex(arr));
	}
}
