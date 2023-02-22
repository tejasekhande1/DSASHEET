import java.util.*;
class Solution{

	public static int fibo(int n,int arr[]){
		if(n == 0 || n == 1) return n;
		if(n == 2) return 1;

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for(int i=3 ; i<=n ; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}

		return arr[n];
	}
	/*
	public static int fibo1(int n,int arr[]){
		if(n == 1 || n == 2){
			return 1;
		}

		if(n == 0){
			return 0;
		}

		if(arr[n] != 0){
			return arr[n];
		}

		arr[n] = fibo(n-2,arr)+fibo(n-1,arr);
		return arr[n];
	}*/
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER : ");
		int n = sc.nextInt();
		int arr[] = new int[n+1];
/*		for(int i=0 ; i<n+1 ; i++){
			arr[i] = -1;
		}*/
		fibo(n,arr);
		System.out.println(arr[n]);
	}
}
