class Solution{
	public void transPose(int mat[][],int N){
		int retMat[][] = new int[N][N];
		for(int i=0 ; i<N ; i++){
			for(int j=0 ; j<N ; j++){
				retMat[j][i] = mat[i][j];
			}
		}

		for(int i=0 ; i<N ; i++){
			for(int j=0 ; j<N ; j++){
				System.out.print(" "+retMat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void myTranspose(int arr[][],int r,int c){
		for(int i=0 ; i<r ; i++){
			for(int j=i+1 ; j<c ; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public void matTranspose(int arr[][],int r,int c,int ret[][]){

		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				ret[j][i] = arr[i][j];
			}
		}
		
		for(int i=0 ; i<c ; i++){
			for(int j=0 ; j<r ; j++){
				System.out.print(" "+ret[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int c = 3;
		int r = 2;
		int mat[][] = {{1,2,3},{4,5,6}};
		int ret[][] = new int[c][r];
//		s.myTranspose(mat,r,c,ret);
		s.matTranspose(mat,r,c,ret);
	}
}
