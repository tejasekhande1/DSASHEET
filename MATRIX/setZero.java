import java.util.*;
class Solution{
	public void setZero(int mat[][],int r,int c){
		int retMat[][] = new int[r][c];
		for(int i[] : retMat)
			Arrays.fill(i,-1);

		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				if(mat[i][j] == 0){
					for(int k=0 ; k<c ; k++){
						retMat[i][k] = 0;
					}
					
					for(int k=0 ; k<r ; k++){
						retMat[k][j] = 0;
					}
				}
			}
		}
		
		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				System.out.print(" "+retMat[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int r = 3;
		int c = 4;
		int mat[][]={{1,2,3,4},{5,6,7,0},{9,2,0,4}};
		s.setZero(mat,r,c);
	}
}
