import java.util.*;
class Solution{
	public void subMatrix(int n,int query[][]){
		int arr[][] = new int[n][n];
	
		for(int [] a : arr){
			Arrays.fill(a,0);
		}
		
		for(int k=0 ; k<query.length ; k++){
			int r1 = query[k][0],c1 = query[k][1],r2 = query[k][2],c2 = query[k][3];
			for(int i=r1 ; i<=r2 ; i++){
				for(int j=c1 ; j<=c2 ; j++){
					arr[i][j] += 1;
				}
			}
		}
		
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n ; j++){
				System.out.print("|"+arr[i][j]+"|");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int n = 2;
//		int query[][] = {{1,1,2,2},{0,0,1,1}};
		int query[][] = {{0,0,1,1}};
		s.subMatrix(n,query);
	}
}
