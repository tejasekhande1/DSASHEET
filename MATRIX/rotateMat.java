class Solution{
	public void rotateMat(int arr[][],int N){
		for(int i=0 ; i<N ; i++){
			for(int j=i+1 ; j<N ; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for(int i=0 ; i<N ; i++){
			int s = 0,e=N-1;
			while(s < e){
				int temp = arr[i][s];
				arr[i][s] = arr[i][e];
				arr[i][e] = temp;
				s++;
				e--;
			}
		}

		for(int i=0 ; i<N ; i++){
			for(int j=0 ; j<N ; j++){
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int N = 3;
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		s.rotateMat(mat,N);
	}
}
