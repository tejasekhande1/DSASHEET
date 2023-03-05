class NumMatrix {
    int [][]matrix;
    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        this.matrix = matrix;
    
        for(int i=1; i<r; i++)
        {
            for(int j=0; j<c; j++) matrix[i][j] = matrix[i][j] + matrix[i-1][j];
        }
        // row wise sum
        for(int i=0; i<r; i++)
        {
            for(int j=1; j<c; j++) matrix[i][j] = matrix[i][j] + matrix[i][j-1];
        }
    }
    
    	public int sumRegion(int row1, int col1, int row2, int col2) {
        // return matrix[row2][col2]-matrix[row2][col1-1]-matrix[row1-1][col2]+matrix[row1-1][col1-1];
        	int totalArea = matrix[row2][col2];
        	int above = (row1 == 0) ? 0 : matrix[row1-1][col2];
       		int sidePart = (col1 == 0) ? 0 : matrix[row2][col1-1];
        	int duplicatePart = (col1 == 0 || row1 == 0) ? 0 : matrix[row1-1][col1-1];
        	int ans = (totalArea - above) - (sidePart - duplicatePart);
        	return ans;
    }
	public static void main(String[]args){
		int arr[][] = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
		NumMatrix obj = new NumMatrix(arr);
		System.out.println(obj.sumRegion(1,1,2,2));
	}
}
