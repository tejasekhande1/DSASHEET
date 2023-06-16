class Solution{

	public void fillMatrix(int retMat[][],int r,int c){
		for(int i=0 ; i<retMat[0].length ; i++){
			retMat[r][i] = 1;
		}
		
		for(int i=0 ; i<retMat.length ; i++){
			retMat[i][c] = 1;
		}
	}

	public void boolMatrix(int mat[][],int r,int c){

		int retMat[][] = new int[r][c];

		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				retMat[i][j] = 0;
				System.out.print(retMat[i][j] + " ");
			}
			System.out.println();
		}

		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				if(mat[i][j] == 1){
					fillMatrix(retMat,i,j);
				}
			}
		}
		
		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				mat[i][j] = retMat[i][j];
				System.out.print(retMat[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int mat[][] = {{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}};
		s.boolMatrix(mat,mat.length,mat[0].length);
	}
}
