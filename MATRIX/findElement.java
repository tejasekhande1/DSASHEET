// WRITE EFFICIENT ALGO TO FIND TARGET VALUE IN MxN INTEGER MATRIX.THIS MATRIX HAS FOLLOWING PROPERTIES :
// 1] INTEGERS IN EACH ROW SORTED IN ASSCENDING ORDER FROM LEFT TO RIGHT
// 2] INTEGERS IN EACH COLUMN SORTED IN ASCENDING ORDER FROM TOP TO BOTTOM

import java.util.*;
class Solution{
	public static void findTarget(int[][] M,int n,int ele){
		int i=0;
		int j=n-1;
		while(i<n && j>=0){
			if(M[i][j] == ele){
				System.out.println("Element Found At Index : ROWIDX->"+i+" and  COLIDX->"+j);
				return;
			}

			if(M[i][j] > ele){
				j--;
			}else{
				i++;
			}
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int n = 5;
		int[][] M ={
			{1,4,7,11,15},
			{2,5,8,12,19},
			{3,6,9,16,22},
			{10,13,14,17,24},
			{18,21,23,26,30}
		};
		int j=1;
		s.findTarget(M,n,8);
	}
}
