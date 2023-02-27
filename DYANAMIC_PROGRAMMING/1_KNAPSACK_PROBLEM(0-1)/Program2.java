
// KNAPSACK PROBLEM USING MEMOIZATION

import java.util.*;
import java.lang.*;
class Solution{
	public int knapSack(int wt[],int val[],int n,int W,int mat[][]){
		if(n == 0 || W == 0){		// BASE CONDITION
			return 0;
		}

		if(mat[n][W] != -1){
			return mat[n][W];
		}

		if(wt[n-1] > W){
			return mat[n][W] = knapSack(wt,val,n-1,W,mat);
		}else{
			return mat[n][W] = Math.max(val[n-1]+knapSack(wt,val,n-1,W-wt[n-1],mat),knapSack(wt,val,n-1,W,mat));
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array : ");
		int n = sc.nextInt();
		int wt[] = new int[n];
		int val[] = new int[n];
		for(int i=0 ; i<n ; i++){
			System.out.println("Enter Weight : ");
			wt[i] = sc.nextInt();
			System.out.println("Enter Value : ");
			val[i] = sc.nextInt();
		}
		System.out.println("Enter Weight of KnapSack : ");
		int W = sc.nextInt();
		int mat[][] = new int[n+1][W+1];
		for(int [] row : mat)
			Arrays.fill(row,-1);
		System.out.println("Maximum Profit : "+s.knapSack(wt,val,n,W,mat));
	}
}
