class Solution{
	public void antiDaigonal(int arr[][],int N){
		for(int i=0 ; i<2*N-1 ; i++){
			for(int j=0 ; j<N ; j++){
				for(int k=0 ; k<N ; k++){
					if(j+k == i){
						System.out.print(" "+arr[j][k]+" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int N = 3;
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		s.antiDaigonal(mat,N);
	}
}
