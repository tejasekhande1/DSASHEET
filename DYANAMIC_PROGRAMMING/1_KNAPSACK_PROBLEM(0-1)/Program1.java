
// KNAPSACK PROBLEM USING RECURSION

import java.util.*;
class Solution{
	public int knapSack(int wt[],int val[],int n,int W){
		if(n == 0 || W == 0){		// BASE CONDITION
			return 0;
		}

		if(wt[n-1] > W){
			return knapSack(wt,val,n-1,W);
		}else{
			return Math.max(val[n-1]+knapSack(wt,val,n-1,W-wt[n-1]),knapSack(wt,val,n-1,W));
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
		System.out.println("Maximum Profit : "+s.knapSack(wt,val,n,W));
	}
}
